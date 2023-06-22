package com.dio.santander.bankline.api.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.repository.movimentacaoRepository;
import com.dio.santander.bankline.api.services.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private movimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	/*@GetMapping("/{id}")
	public Movimentacao movimentacao(@PathVariable("id") Integer id) {
		Optional<Movimentacao> movimentacaoFind = this.repository.findById(id);
		
		if(movimentacaoFind.isPresent()) {
			return movimentacaoFind.get();
		}
		return null;
	}*/
	
	@GetMapping
	public List<Movimentacao> findAll() {
		return repository.findAll();
		
	}
	
	@GetMapping("/{idConta}")
	public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta) {
		
		return repository.findByIdConta(idConta);
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
		
	}
	
	@DeleteMapping("/{id}")
    public Movimentacao deleteById(@PathVariable("id") Integer id) {
		
		if(this.repository.existsById(id)) {
			repository.deleteById(id);
		}
		return null;
	}

}
