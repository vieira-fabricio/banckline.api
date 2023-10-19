package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="table_correntista")
public class Correntista {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		@Column(length = 20)
		private String cpf;
		@Column(length = 60)
		private String nome;

		@Embedded
		private Conta conta;
		@Embedded
		private Cartao cartao;
		@Embedded
		private List<Recurso> recursos;
		@Embedded
		private List<Novidades> novidades;


		public Conta getConta() {
			return conta;
		}
		public void setConta(Conta conta) {
			this.conta = conta;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Cartao getCartao() {
			return cartao;
		}

		public void setCartao(Cartao cartao) {
			this.cartao = cartao;
		}

		public List<Recurso> getRecursos() {
			return recursos;
		}

		public void setRecursos(List<Recurso> recursos) {
			this.recursos = recursos;
		}

		public List<Novidades> getNovidades() {
			return novidades;
		}

		public void setNovidades(List<Novidades> novidades) {
			this.novidades = novidades;
		}
}
