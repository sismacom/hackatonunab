/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.PuntoDeVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SISMACOM
 */
@Repository("puntodeventa")
public interface IPuntoDeVentaRepository extends JpaRepository<PuntoDeVenta, Long>{
    
}
