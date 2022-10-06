package com.devsuperior.movieflix.dto;

import java.util.List;

public class GenreDTO {

	private Long id;
	private String name;
	private List<MovieDTO> movies;
	
	public GenreDTO() {
		
	}

	public GenreDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MovieDTO> getMovies() {
		return movies;
	}
}
