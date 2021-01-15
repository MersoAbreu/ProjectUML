package com.emersonabreu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emersonabreu.project.domain.Estado;
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	
}
