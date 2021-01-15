package com.emersonabreu.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonabreu.project.domain.Cliente;
import com.emersonabreu.project.repository.ClienteRepository;
import com.emersonabreu.project.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado! Id: "+id+"Tipo: "+Cliente.class.getName()));
	}
}
