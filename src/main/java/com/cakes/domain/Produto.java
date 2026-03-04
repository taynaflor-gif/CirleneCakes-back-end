package com.cakes.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.cakes.domain.enums.UnidadeMedida;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;

	private String nome_produto;

	private BigDecimal valor_produto;

	@Enumerated(EnumType.STRING)
	private UnidadeMedida unidade_medida;

	@ManyToMany
	@JoinTable(name = "PRODUTO_SABOR", joinColumns = @JoinColumn(name = "id_produto"), inverseJoinColumns = @JoinColumn(name = "id_sabor"))
	private List<Sabor> sabores;

	public Produto() {
		super();
	}

	public Produto(Long id_produto, String nome_produto, BigDecimal valor_produto, UnidadeMedida unidade_medida,
			List<Sabor> sabores) {
		super();
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.valor_produto = valor_produto;
		this.unidade_medida = unidade_medida;
		this.sabores = sabores;
	}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public BigDecimal getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(BigDecimal valor_produto) {
		this.valor_produto = valor_produto;
	}

	public UnidadeMedida getUnidade_medida() {
		return unidade_medida;
	}

	public void setUnidade_medida(UnidadeMedida unidade_medida) {
		this.unidade_medida = unidade_medida;
	}

	public List<Sabor> getSabores() {
		return sabores;
	}

	public void setSabores(List<Sabor> sabores) {
		this.sabores = sabores;
	}

}