package com.cakes.service;

import java.util.List;

import com.cakes.domain.Produto;

public interface ProdutoService {
	
	public Produto criarProduto(Produto produto);

	public List<Produto> buscarProduto();
	
	public Produto atualizarProduto(Produto dados); 
	
	public void deletarProduto(Long id);
}
