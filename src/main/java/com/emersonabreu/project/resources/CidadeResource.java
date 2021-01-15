package com.emersonabreu.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emersonabreu.project.domain.Cidade;
import com.emersonabreu.project.services.CidadeService;

@Controller
@RequestMapping(value="/cidades")
public class CidadeResource {

	@Autowired
	private CidadeService cidadeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cidade>> list() {
		List<Cidade> cid = cidadeService.listar();
		return ResponseEntity.ok().body(cid);
	}
}

