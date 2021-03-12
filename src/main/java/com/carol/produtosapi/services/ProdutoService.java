package com.carol.produtosapi.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carol.produtosapi.domain.Produto;
import com.carol.produtosapi.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto find(Long id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return obj.orElseThrow(() -> new EntityNotFoundException());
	}
	
	public Produto insert(Produto obj) {
		obj.setId(null);
		return produtoRepository.save(obj);
	}

	public Produto update(Produto obj) {
		find(obj.getId());
		return produtoRepository.save(obj);
	}

	public void delete(Long id) {
		produtoRepository.deleteById(id);
		
	}

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}
	
}
