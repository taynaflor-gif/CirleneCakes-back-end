package com.cakes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakes.domain.Produto;
import com.cakes.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping()
	public ResponseEntity<Produto> criarProdutos(@RequestBody Produto produto) {
		return ResponseEntity.ok(produtoService.criarProduto(produto));
	}

	@GetMapping()
	public List<Produto> Produto() {

		return produtoService.buscarProduto();
	}
	
	@PutMapping()
	public Produto atualizar(@RequestBody Produto produto) {
		
		return produtoService. atualizarProduto(produto);
	}

	@DeleteMapping("{id}")
	public void deletar(@PathVariable Long id){
		produtoService.deletarProduto(id);
	}
}
