package com.HibernateMTO.MTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HibernateMTO.MTO.entity.Streets;

@Repository
public interface StreetRepository extends JpaRepository<Streets, Integer>{

}
