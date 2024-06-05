package com.HibernateMTO.MTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HibernateMTO.MTO.entity.Vilage;

@Repository
public interface VillageRepository extends JpaRepository<Vilage, Integer> {

}
