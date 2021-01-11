package com.emersonabreu.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonabreu.project.domain.Categoria;
import com.emersonabreu.project.repository.CategoriaRepository;
import com.emersonabreu.project.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado! Id: "+id+"Tipo: "+Categoria.class.getName()));
	}
	
	public Categoria inserir(Categoria categoria) {
		Categoria obj = categoriaRepository.save(categoria);
		return obj;
	}
	
	
}
