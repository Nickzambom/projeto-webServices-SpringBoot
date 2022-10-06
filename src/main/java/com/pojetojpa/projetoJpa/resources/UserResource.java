package com.pojetojpa.projetoJpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojetojpa.projetoJpa.entities.User;

@RestController
@RequestMapping(value = "/users")
//função que retorna recursos da classe User
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "maria", "maria@gmail.com", "999999", "12345");
		//retorna no corpo
		return ResponseEntity.ok().body(u);
	}

}
