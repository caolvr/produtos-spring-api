package com.carol.produtosapi.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 5)
	@NotEmpty(message = "Descrição do produto não pode ser vazia.")
	private String descricao;
	
	@NotNull
	@DecimalMin(value = "0.00")
	private BigDecimal valor;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "produto", cascade = CascadeType.ALL)
	private Estoque estoque;
	
	public Produto() {}
	
	public Produto(Long id, String descricao, BigDecimal valor, Integer quantidade) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.estoque.setQuantidade(quantidade);
		//this.estoque.setProduto(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
}
