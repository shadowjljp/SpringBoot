package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Alien;
import com.example.demo.dao.AlienRepo;
//springboot default is Json not XML
@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) { //@reqestBody for receiving raw data in json form.
		repo.save(alien);
		return alien;
	}
	
	@RequestMapping(path = "/aliens",consumes= {"application/json"})  //consume makes this method only accept certain dataType
	@ResponseBody  //not a view name, we are returning actual data.
	public String getAliens() {
	
		//Alien alien = repo.findById(aid).orElse(new Alien());
		
		//System.out.println(repo.findByTechSorted("Java",101));
		//mv.addObject(alien);
		//return mv;
		return repo.findAll().toString();
	}
	@GetMapping("/aliens/{aid}")
	@ResponseBody  //not a view name, we are returning actual data.
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@PutMapping("/alien")
	public Alien updateAlien(@RequestBody Alien alien) { //@reqestBody for receiving raw data in json form.
		repo.save(alien);
		return alien;
	}
}
