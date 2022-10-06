package com.pojetojpa.projetoJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pojetojpa.projetoJpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
