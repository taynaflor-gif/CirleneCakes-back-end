package com.cakes.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUTO_SABOR")
public class ProdutoSabor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto_sabor;

	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;

	@ManyToOne
	@JoinColumn(name = "id_sabor")
	private Sabor sabor;

	public ProdutoSabor() {
		super();
	}

	public ProdutoSabor(Long id_produto_sabor, Produto produto, Sabor sabor) {
		super();
		this.id_produto_sabor = id_produto_sabor;
		this.produto = produto;
		this.sabor = sabor;
	}

	public Long getId_produto_sabor() {
		return id_produto_sabor;
	}

	public void setId_produto_sabor(Long id_produto_sabor) {
		this.id_produto_sabor = id_produto_sabor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

}
