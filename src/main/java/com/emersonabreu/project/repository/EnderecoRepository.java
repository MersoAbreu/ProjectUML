package com.emersonabreu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emersonabreu.project.domain.Endereco;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	
}
