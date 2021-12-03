/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Categoria;
import com.ejemplo.tiendaalamano.service.ICategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SISMACOM
 */
@RestController
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    private ICategoriaService catServ;

    @PostMapping("/categoria/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria categoria) {
        //System.out.println("CATEGORIA: " + categoria.toString());
        return catServ.save(categoria);
    }

    @GetMapping("/categoria/buscar/{id}")
    public Categoria findByID(@PathVariable Long id) {
        return catServ.findByID(id);
    }

    @GetMapping("/categoria/listartodas")
    public List<Categoria> findAll() {
        return catServ.findAll();
    }

    @DeleteMapping("/categoria/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        catServ.deleteById(id);
    }

}
