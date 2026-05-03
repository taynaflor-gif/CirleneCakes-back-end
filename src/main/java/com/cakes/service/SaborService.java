package com.cakes.service;

import com.cakes.domain.Sabor;

import java.util.List;

public interface SaborService {

    public Sabor criarSabor(Sabor sabor);

    public List<Sabor> listarSabores();

    public Sabor atualizarSabor(Sabor sabor);

    public void deltarSabor(Long id);

}
