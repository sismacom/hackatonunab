/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Producto;
import com.ejemplo.tiendaalamano.service.IProductoService;
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
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoServ;

    @GetMapping("/buscar/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoServ.findById(id);
    }
    
    @GetMapping("/buscarnombre/{nombre}")
    public List<Producto> buscarPorNombre(@PathVariable String nombre) {
        return productoServ.buscarPorNombre(nombre);
    }
    
    @GetMapping("/buscarmarca/{marca}")
    public List<Producto> buscarPorMarca(@PathVariable String marca) {
        return productoServ.buscarPorMarca(marca);
    }

    @GetMapping("/listartodas")
    public List<Producto> findAll() {
        return productoServ.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto save(@RequestBody Producto producto) {
        return productoServ.save(producto);
    }

    @DeleteMapping("/borrar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteById(@PathVariable Long id) {
        try{
            productoServ.deleteById(id);
            return "Eliminado con exito";
       }
       catch(Exception e){
           return "Error al eliminar ID no encontrado";
       }
    }

}
