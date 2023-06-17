package com.dio.santander.bankline.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.correntistaRepository;
import com.dio.santander.bankline.api.services.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private correntistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping("/{id}")
	public Correntista correntista(@PathVariable("id") Integer id) {
		Optional<Correntista> correntistaFind = this.repository.findById(id);
		
		if(correntistaFind.isPresent()) {
			return correntistaFind.get();
		}
		return null;
	}
	
	@GetMapping
	public List<Correntista> findAll() {
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
		
	}
	
	@DeleteMapping("/{id}")
	public Correntista deleteById(@PathVariable("id") Integer id) {
		
		if(this.repository.existsById(id)) {
			repository.deleteById(id);
		}
		return null;
	}

}
