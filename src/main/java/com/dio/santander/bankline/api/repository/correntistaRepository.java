package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Correntista;

public interface correntistaRepository extends JpaRepository<Correntista, Integer> {
	
}
