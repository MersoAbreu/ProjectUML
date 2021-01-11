package com.emersonabreu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonabreu.project.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
