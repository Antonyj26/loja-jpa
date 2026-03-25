package com.projeto.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.loja.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
