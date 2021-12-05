/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Usuario;
import com.ejemplo.tiendaalamano.service.IUsuarioService;
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
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService catUsuario;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario) {
        return catUsuario.save(usuario);
    }

    @GetMapping("/buscar/{id}")
    public Usuario findById(@PathVariable Long id) {
        return catUsuario.findById(id).orElse(null);
    }
    
    @GetMapping("/listartodas")
    public List<Usuario> findAll() {
        return catUsuario.findAll();
    }

    @DeleteMapping("/borrar/{id}")
    //@ResponseStatus(HttpStatus.OK)
    public String deleteById(@PathVariable Long id) {
        try{
            catUsuario.deleteById(id);
            return "Eliminado con exito";
       }
       catch(Exception e){
           return "Error al eliminar ID no encontrado";
       }
    }

}
