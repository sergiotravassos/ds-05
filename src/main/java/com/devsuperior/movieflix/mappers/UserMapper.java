package com.devsuperior.movieflix.mappers;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.movieflix.dto.RoleDTO;
import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;

public class UserMapper {

	public static UserDTO userToUserDto(User entity) {
		
		UserDTO dto = new UserDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		
		Set<RoleDTO> roles = new HashSet<>();
		
		entity.getRoles().forEach(role -> {
			RoleDTO roleDto = new RoleDTO();
			roleDto.setId(role.getId());
			roleDto.setAuthority(role.getAuthority());
			roles.add(roleDto);
		});
		
		dto.setRoles(roles);
		
		return dto;
		
	}
	
}
