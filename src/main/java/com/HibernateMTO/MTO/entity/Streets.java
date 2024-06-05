package com.HibernateMTO.MTO.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "streets")
public class Streets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	private String name;
	
	private int members;
	
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name = "FK_Vno")
	private Vilage vilage;

}
