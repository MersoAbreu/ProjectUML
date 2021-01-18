package com.emersonabreu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emersonabreu.project.domain.Pagamento;
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
