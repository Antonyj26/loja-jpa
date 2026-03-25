package com.projeto.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.loja.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
	
}
