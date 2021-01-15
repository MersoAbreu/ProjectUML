package com.emersonabreu.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonabreu.project.domain.Cidade;
import com.emersonabreu.project.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	public List<Cidade> listar(){
		List<Cidade> cidades = cidadeRepository.findAll();
		return cidades;
	}
	

	
	
}
