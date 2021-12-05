/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service.serviceimpl;

import com.ejemplo.tiendaalamano.model.Producto;
import com.ejemplo.tiendaalamano.repository.IProductoRepository;
import com.ejemplo.tiendaalamano.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ryzen 3600
 */
@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository productoRepo;
    
    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return productoRepo.findById(id).orElse(null);//convierte un opcional a un objeto
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return productoRepo.findAll();
    }

    @Override
    @Transactional
    public Producto save(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public void deleteById(Long id) {
        productoRepo.deleteById(id);
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        System.out.println(nombre);
        return productoRepo.buscarPorNombre(nombre);
    }

    @Override
    public List<Producto> buscarPorMarca(String marca) {
        return productoRepo.buscarPorMarca(marca);
    }
    
}
