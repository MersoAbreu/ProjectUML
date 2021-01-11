package com.emersonabreu.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonabreu.project.domain.Categoria;
import com.emersonabreu.project.domain.Produto;
import com.emersonabreu.project.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto inserir(Produto produto) {
		
		Produto produtos = produtoRepository.save(produto);
		Categoria categoria = new Categoria();
		if(categoria!=null) {
		categoria.getProdutos().add(produto);
		}
		return produtos;
	}
	public List<Produto> Listar(){
		List<Produto> produtos = produtoRepository.findAll();
		return produtos;
	}
	
	
}
