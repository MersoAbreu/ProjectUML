package com.emersonabreu.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emersonabreu.project.domain.Cidade;
import com.emersonabreu.project.domain.Cliente;
import com.emersonabreu.project.domain.Endereco;
import com.emersonabreu.project.domain.Estado;
import com.emersonabreu.project.domain.enums.TipoCliente;
import com.emersonabreu.project.repository.CidadeRepository;
import com.emersonabreu.project.repository.ClienteRepository;
import com.emersonabreu.project.repository.EnderecoRepository;
import com.emersonabreu.project.repository.EstadoRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
	
	@Override
	public void run (String...args)throws Exception{
		
		
		Estado est1 = new Estado(1, "São Paulo");
		Estado est2 = new Estado (2, "Paraná");
		Cidade c1 = new Cidade(1, "Campinas", est1);
		Cidade c2 = new Cidade(2,"Sandovalina", est1);
		Cidade c3 = new Cidade(3,"Arapongas", est2);
		
	
		
		estadoRepository.save(est2);
		cidadeRepository.save(c1);
		cidadeRepository.save(c2);
		cidadeRepository.save(c3);
		
		Cliente cli1 = new Cliente(9, "Maria Silva", "maria@gmail.com","12345678574", TipoCliente.PESSOAFISICA);
		//cli1.getTelefones().addAll(Arrays.asList("1895885254","1899785585"));
		
		//Cliente cli2 = new Cliente(2, "Jose Pereira Caetano", "jose.pereira@gmail.com","12345678574", TipoCliente.PESSOAFISICA);
		//cli2.getTelefones().addAll(Arrays.asList("1899856625","18998522547"));
		
		Endereco end1 = new Endereco(22, "Jose Augusto Freire", "587", "Casa", "Centro", "18.856-968", c1, cli1);
		//Endereco end2 = new Endereco(2, "Mario Peixoto", "852", "Apto", "Vila Cesar", "85.968-963", c2, cli1);
		
		
		cli1.getEnderecos().add(end1);
		//clienteRepository.save(cli1);
		enderecoRepository.save(end1);
		
	}

}
