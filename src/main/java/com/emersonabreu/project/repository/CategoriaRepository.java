package com.emersonabreu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonabreu.project.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
}
