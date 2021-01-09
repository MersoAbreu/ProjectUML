package com.emersonabreu.project.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emersonabreu.project.domain.Categoria;
import com.emersonabreu.project.repository.CategoriaRepository;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	public CategoriaRepository categoriaRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> Listar() {
		Categoria cat1 = new Categoria(1,"Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		
		
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
	
	

}
