/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Producto;
import java.util.List;

/**
 *
 * c create
 * r read
 * u update
 * d delete
 * 
 * metodos generales creados en el repository
 */
public interface IProductoService {

    public Producto findById(Long id);

    public List<Producto> findAll();

    public Producto save(Producto producto);

    public void deleteById(Long id);
    //Requerimiento 1
    public List<Producto> buscarPorNombre(String nombre);
    
    public List<Producto> buscarPorMarca(String marca);
    

}
