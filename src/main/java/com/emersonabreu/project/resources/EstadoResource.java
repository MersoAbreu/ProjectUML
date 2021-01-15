package com.emersonabreu.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emersonabreu.project.domain.Estado;
import com.emersonabreu.project.services.EstadoService;

@RequestMapping(value="/estados")
@Controller
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Estado> insert(@RequestBody Estado estado){
		Estado est = estadoService.inserir(estado);
		return ResponseEntity.ok().body(est);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Estado>> index(){
		List<Estado> est = estadoService.listar();
		return ResponseEntity.ok().body(est);
	}
}
