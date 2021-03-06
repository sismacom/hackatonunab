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
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    private ICategoriaService catServ;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria categoria) {
        return catServ.save(categoria);
    }

    @GetMapping("/buscar/{id}")
    public Categoria findByID(@PathVariable Long id) {
        return catServ.findByID(id);
    }

    @GetMapping("/listartodas")
    public List<Categoria> findAll() {
        return catServ.findAll();
    }

    @DeleteMapping("/borrar/{id}")
    //@ResponseStatus(HttpStatus.OK)
    public String deleteById(@PathVariable Long id) {
        try{
            catServ.deleteById(id);
            return "Eliminado con exito";
       }
       catch(Exception e){
           return "Error al eliminar ID no encontrado";
       }
    }

}
