package com.emersonabreu.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonabreu.project.domain.Estado;
import com.emersonabreu.project.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public Estado inserir(Estado estado) {
		Estado est = estadoRepository.save(estado);
		return est;
	}
	
	public List<Estado> listar() {
		List<Estado> est = estadoRepository.findAll();
		return est;
	}
}
