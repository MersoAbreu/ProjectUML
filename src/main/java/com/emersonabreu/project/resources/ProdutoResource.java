package com.emersonabreu.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emersonabreu.project.domain.Produto;
import com.emersonabreu.project.services.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Produto> insert(@RequestBody Produto produto){
		Produto prod = produtoService.inserir(produto);
		return ResponseEntity.ok().body(prod);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> list(){
		List<Produto> prod = produtoService.Listar();
		return ResponseEntity.ok().body(prod);
	}
}
