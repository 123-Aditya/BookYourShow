package com.example.jsppractice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsppractice.model.Theatre;
import com.example.jsppractice.repository.TheatreRepository;

@RestController
@RequestMapping(value = "/rest/theatre")
public class TheatreResource {
	
	@Autowired
	TheatreRepository theatreRepository;
	
	@GetMapping(value = "/alltheatre")
	public List<Theatre> getAll() {
		return theatreRepository.findAll();
		
	}
	
	@PostMapping(value = "/loadtheatre")
	public List<Theatre> persist(@RequestBody final Theatre theatre){
		theatreRepository.save(theatre);
		return theatreRepository.findAll();
	}

}
