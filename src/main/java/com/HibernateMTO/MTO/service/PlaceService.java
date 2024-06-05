package com.HibernateMTO.MTO.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HibernateMTO.MTO.entity.Streets;
import com.HibernateMTO.MTO.entity.Vilage;
import com.HibernateMTO.MTO.repository.StreetRepository;
import com.HibernateMTO.MTO.repository.VillageRepository;

@Service
public class PlaceService implements ServiceImplement {
	
	@Autowired
	private VillageRepository placeRepository;
	
	@Autowired
	private StreetRepository repository;

	@Override
	public Vilage post(Vilage vilage) {
		return placeRepository.save(vilage);
	}

	@Override
	public List<Vilage> postall(List<Vilage> vilage) {
		return placeRepository.saveAll(vilage);
		
	}

	@Override
	public Optional<Vilage> get(int vno) {
		return placeRepository.findById(vno);
	}

	@Override
	public List<Vilage> getall() {
		return placeRepository.findAll();
	}

	@Override
	public Vilage update(Vilage vilage) {
		Optional<Vilage>optional=placeRepository.findById(vilage.getVno());
		Vilage vilage2=optional.get();
		vilage2.setVno(vilage.getVno());
		vilage2.setVname(vilage.getVname());
		vilage2.setStreets(vilage.getStreets());
		return placeRepository.save(vilage);
	}

	@Override
	public String delete(int vno) {
		placeRepository.deleteById(vno);
		return "Successfully Deleted";
	}

//	@Override
//	public Streets update(Streets streets) {
//		return placeRepository.save(streets);
//	}
	
	
	
	


}
