package com.projeto.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.loja.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
