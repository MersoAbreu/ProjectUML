package com.emersonabreu.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonabreu.project.domain.Categoria;
import com.emersonabreu.project.repository.CategoriaRepository;

@Service
public class CategoriaService {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj;
	}
	
	public Categoria inserir(Categoria categoria) {
		Categoria obj = categoriaRepository.save(categoria);
		return obj;
	}
}
