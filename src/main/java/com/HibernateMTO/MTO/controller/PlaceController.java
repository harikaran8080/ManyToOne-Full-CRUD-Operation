package com.HibernateMTO.MTO.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HibernateMTO.MTO.entity.Streets;
import com.HibernateMTO.MTO.entity.Vilage;
import com.HibernateMTO.MTO.service.ServiceImplement;

@RestController
@RequestMapping("/Place/api")
public class PlaceController {
	
	@Autowired
	private ServiceImplement implement;
	
	@PostMapping("/post")
	public Vilage post(@RequestBody Vilage vilage) {
		return implement.post(vilage);
		
	}
	@PostMapping("/postall")
	public List<Vilage>postall(@RequestBody List<Vilage> vilage){
		return implement.postall(vilage);
		
	}
	
	@GetMapping("/get/{Vno}")
	public Optional<Vilage>get(@PathVariable int Vno){
		return implement.get(Vno);
		
	}
	
	@GetMapping("/getall")
	public List<Vilage>getall(){
		return implement.getall();
		
	}
	
	
	@PutMapping("/update")
	public Vilage update(@RequestBody Vilage vilage) {
		return implement.update(vilage);
		
	}
//	@PutMapping("/update/Streets")
//	public Streets upd(@RequestBody Streets streets) {
//		return implement.update(streets);
//		
//	}
	
	@DeleteMapping("/delete/{vno}")
	public String delete(@PathVariable int vno) {
		return implement.delete(vno);
		
	}

}
