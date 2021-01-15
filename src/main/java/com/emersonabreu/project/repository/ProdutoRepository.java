package com.emersonabreu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emersonabreu.project.domain.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}