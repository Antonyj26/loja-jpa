package com.projeto.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.loja.entities.OrderItem;
import com.projeto.loja.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
