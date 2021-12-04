/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.PuntoDeVenta;
import java.util.List;

/**
 *
 * @author SISMACOM
 */
public interface IPuntoDeVentaService {
    
    public PuntoDeVenta save(PuntoDeVenta puntodeventa);

    public List<PuntoDeVenta> findAll();

    public PuntoDeVenta findByID(Long id);

    public void deleteById(Long id);
    
}
