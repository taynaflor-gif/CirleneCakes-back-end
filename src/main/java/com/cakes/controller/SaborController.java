package com.cakes.controller;

import com.cakes.domain.Sabor;
import com.cakes.service.SaborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sabores")
public class SaborController {

    @Autowired
    private SaborService saborService;

    @PostMapping
    public ResponseEntity<?> criarSabor(@RequestBody Sabor sabor) {
        return ResponseEntity.ok(saborService.criarSabor(sabor));
    }

    @GetMapping
    public ResponseEntity<?> listarSabores() {
        return ResponseEntity.ok(saborService.listarSabores());
    }

    @PutMapping
    public ResponseEntity<?> atualizarSabor(Sabor sabor) {
        return ResponseEntity.ok(saborService.atualizarSabor(sabor));
    }

    @DeleteMapping("{id}")
    public void deletarSabor(@PathVariable Long id) {
        saborService.deltarSabor(id);
    }


}
