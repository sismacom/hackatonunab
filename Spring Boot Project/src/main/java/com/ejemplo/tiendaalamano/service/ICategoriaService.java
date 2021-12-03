/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Categoria;
import java.util.List;

/**
 *
 * @author SISMACOM
 */
public interface ICategoriaService {

    public Categoria save(Categoria categoria);

    public Categoria findByID(Long id);

    public List<Categoria> findAll();

    public void deleteById(Long id);

}
