package com.emersonabreu.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonabreu.project.domain.Pedido;
import com.emersonabreu.project.repository.PedidoRepository;
import com.emersonabreu.project.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);
		return obj.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado! Id: "+id+"Tipo: "+Pedido.class.getName()));
	}
}
