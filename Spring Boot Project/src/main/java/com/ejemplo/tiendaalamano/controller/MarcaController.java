/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.service.IMarcaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SISMACOM
 */
@RestController
@RequestMapping("/api/marca")
public class MarcaController {

    @Autowired
    private IMarcaService marcaServ;

    @GetMapping("/buscar/{id}")
    public Marca findById(@PathVariable Long id) {
        return marcaServ.findById(id);
    }

    @GetMapping("/listartodas")
    public List<Marca> findAll() {
        return marcaServ.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Marca save(Marca marca) {
        return marcaServ.save(marca);
    }

    @DeleteMapping("/borrar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(Long Id) {
        marcaServ.deleteById(Id);
    }

}
