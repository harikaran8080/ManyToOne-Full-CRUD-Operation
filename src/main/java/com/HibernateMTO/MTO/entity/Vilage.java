package com.HibernateMTO.MTO.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "village")
public class Vilage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Vno;
	
	private String Vname;
	

	@OneToMany(mappedBy = "vilage",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Streets>streets;
	
	

}
