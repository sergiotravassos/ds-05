package com.devsuperior.movieflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.services.GenreService;

@RestController
@RequestMapping(value = "/reviews")
public class GenreController {

	@Autowired
	private GenreService service;
	
	@GetMapping(value = "/id")
	public ResponseEntity<GenreDTO> findGenre(){
		GenreDTO dto = service.findGenre();
		return ResponseEntity.ok().body(dto);
	}
	
}
