/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Marca;
import java.util.List;

/**
 *
 * @author SISMACOM
 */
public interface IMarcaService {

    public Marca findById(Long id);

    public List<Marca> findAll();

    public Marca save(Marca marca);

    public void deleteById(Long id);

}
