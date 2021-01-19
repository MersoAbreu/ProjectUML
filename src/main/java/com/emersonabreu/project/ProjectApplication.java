package com.emersonabreu.project;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emersonabreu.project.domain.Cidade;
import com.emersonabreu.project.domain.Cliente;
import com.emersonabreu.project.domain.Endereco;
import com.emersonabreu.project.domain.Estado;
import com.emersonabreu.project.domain.ItemPedido;
import com.emersonabreu.project.domain.Pagamento;
import com.emersonabreu.project.domain.PagamentoComCartao;
import com.emersonabreu.project.domain.Pedido;
import com.emersonabreu.project.domain.enums.EstadoPagamento;
import com.emersonabreu.project.domain.enums.TipoCliente;
import com.emersonabreu.project.repository.CidadeRepository;
import com.emersonabreu.project.repository.ClienteRepository;
import com.emersonabreu.project.repository.EnderecoRepository;
import com.emersonabreu.project.repository.EstadoRepository;
import com.emersonabreu.project.repository.PagamentoRepository;
import com.emersonabreu.project.repository.PedidoRepository;

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
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	
	
	
	
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
		
	
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3)); 
		
		
		Cliente cli1 = new Cliente(2, "Maria Silva", "maria@gmail.com","12345678574", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("1895885254","1899785585"));
		
		Cliente cli2 = new Cliente(3, "Jose Pereira Caetano", "jose.pereira@gmail.com","12345678574", TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("1899856625","18998522547"));
		
		Endereco end1 = new Endereco( 3,"Rua Cecilio Vergas", "578", "Casa", "Centro", "19550-000", c1, cli1);
		//Endereco end2 = new Endereco(3, "Mario Peixoto", "852", "Apto", "Vila Cesar", "85.968-963", c2, cli2);
		
		/*
		cli1.getEnderecos().addAll(Arrays.asList(end1));
		cli2.getEnderecos().addAll(Arrays.asList(end1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1));
		
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/mm/yyyy hh:mm");
		
		Pedido ped1 = new Pedido(1, sdf.parse("17/01/2021 15:16"),cli1, end1);
		Pedido ped2 = new Pedido(2, sdf.parse("17/01/2021 15:25"), cli1, end1);
		
		
		Pagamento pag1 = new PagamentoComCartao(1, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pag1);
		
		//Pagamento pag2 = new PagamentoComBoleto(2, EstadoPagamento.PENDENTE, ped1, sdf.parse("20/02/2021 00:00" ), null);
		//ped2.setPagamento(pag2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pag1));
		
		*/
		
		
	}

}
