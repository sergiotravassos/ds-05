package com.devsuperior.movieflix.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RoleDTO {

	@JsonIgnore
	private Long id;
	private String authority;
	
	public RoleDTO() {
		
	}

	public RoleDTO(Long id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
