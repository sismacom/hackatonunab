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
 * @author SISMACOM
 */
public interface IProductoService {
    
    public Producto findById(Long id);
    public List<Producto> findByName(String name);
    public List<Producto> findByMarca(String marca);
    
    public Producto guardarProducto(Producto producto);
    
    public void deleteProductoById(Long id);
    
    List<Producto> getAllProductos();
    
}
