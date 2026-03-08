package com.cakes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakes.domain.Produto;
import com.cakes.domain.enums.UnidadeMedida;
import com.cakes.repository.ProdutoRepository;
import com.cakes.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto criarProduto(Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	public List<Produto> buscarProduto() {
		return produtoRepository.findAll();
	}
	
	

}
