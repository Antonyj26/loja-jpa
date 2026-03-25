package com.projeto.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.loja.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
