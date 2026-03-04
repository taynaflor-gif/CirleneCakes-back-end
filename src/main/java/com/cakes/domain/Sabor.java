package com.cakes.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SABOR")
public class Sabor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sabor;

	private String nome_sabor;

	public Sabor() {
		super();
	}

	public Sabor(Long id_sabor, String nome_sabor) {
		super();
		this.id_sabor = id_sabor;
		this.nome_sabor = nome_sabor;
	}

	public Long getId_sabor() {
		return id_sabor;
	}

	public void setId_sabor(Long id_sabor) {
		this.id_sabor = id_sabor;
	}

	public String getNome_sabor() {
		return nome_sabor;
	}

	public void setNome_sabor(String nome_sabor) {
		this.nome_sabor = nome_sabor;
	}

}
