package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Movimentacao;

public interface movimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
