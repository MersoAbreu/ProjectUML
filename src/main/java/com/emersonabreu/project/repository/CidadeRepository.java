package com.emersonabreu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emersonabreu.project.domain.Cidade;
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
