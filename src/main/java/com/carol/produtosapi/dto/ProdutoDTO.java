package com.carol.produtosapi.dto;

import java.math.BigDecimal;

import com.carol.produtosapi.domain.Produto;

public class ProdutoDTO {
	
	private Long id;
	
	private String descricao;
	
	private BigDecimal valor;
	
	private Integer quantidade;
	
	public ProdutoDTO() {}
	
	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.descricao = produto.getDescricao();
		this.valor = produto.getValor();
		this.quantidade = produto.getEstoque().getQuantidade();
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	
}
