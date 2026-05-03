package com.cakes.service.impl;

import com.cakes.domain.Sabor;
import com.cakes.repository.SaborRepository;
import com.cakes.service.SaborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaborServiceImpl implements SaborService {

    @Autowired
    private SaborRepository saborRepository;

    public Sabor criarSabor(Sabor sabor) {
        saborRepository.save(sabor);
        return sabor;
    }

    public List<Sabor> listarSabores() {
        return saborRepository.findAll();
    }

    public Sabor atualizarSabor(Sabor sabor) {
        saborRepository.save(sabor);
        return sabor;
    }

    public void deltarSabor(Long id) {
        saborRepository.deleteById(id);
    }
}
