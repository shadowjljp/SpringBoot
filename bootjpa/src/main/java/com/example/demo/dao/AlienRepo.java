package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	//name should start findBy or getBy
//	List<Alien> findByTech(String tech);
//	List<Alien> findByAidGreaterThan(int aid);
//	
//	//self define query
//	@Query("from Alien where tech=?1 and aid>?2 order by aname ")
//	List<Alien> findByTechSorted(String tech,int aid);
}