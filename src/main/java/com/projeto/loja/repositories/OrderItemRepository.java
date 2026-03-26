package com.projeto.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.loja.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
