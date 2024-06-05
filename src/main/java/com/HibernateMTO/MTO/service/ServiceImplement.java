package com.HibernateMTO.MTO.service;

import java.util.List;
import java.util.Optional;

import com.HibernateMTO.MTO.entity.Streets;
import com.HibernateMTO.MTO.entity.Vilage;

public interface ServiceImplement {

	Vilage post(Vilage vilage);


	List<Vilage> postall(List<Vilage> vilage);


	Optional<Vilage> get(int vno);


	List<Vilage> getall();


	Vilage update(Vilage vilage);


	String delete(int vno);


//	Streets update(Streets streets);

}
