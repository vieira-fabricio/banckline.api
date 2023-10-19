package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Conta {
	
	@Column(name="conta_numero", unique = true)
	private Long numero;
	@Column(name="conta_agencia")
	private String agencia;
	@Column(name="conta_saldo", scale = 11, precision = 2)
	private Double saldo;
	@Column(name="conta_limite", scale = 11, precision = 2)
	private BigDecimal limite;
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public BigDecimal getLimite() {
		return limite;
	}
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
}
