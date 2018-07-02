package com.saurabh.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.springboot.models.Person;
import com.saurabh.springboot.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping
	public List<Person> list() {
		return personRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Person findById(@PathVariable("id") Integer id) {
		return personRepository.getOne(id);
	}
}
