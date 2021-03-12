package com.carol.produtosapi.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity 
public class Estoque implements Serializable{
	private static final long serialVersionUID = 1L;
	
//	@Id
//	private Long id;
	@Min(0)
	private Integer quantidade;
	
	@JsonBackReference
	@OneToOne
	@Id
	private Produto produto;
	
	public Estoque() {}

	public Estoque(Integer quantidade) {
		this.quantidade = quantidade;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
