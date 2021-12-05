/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Ryzen 3600
 */
public interface IProductoRepository extends JpaRepository<Producto, Long> {
   
   //@Query("select p from Producto p where p.nombreProducto like %?1%")//?1 tomar primer parametro de la consulta
   @Query("select p from Producto p where p.nombreProducto like %:nombre%")
   List<Producto> buscarPorNombre(String nombre);
    
   @Query("select p from Producto p, Marca m where p.marca = m.id and m.nombre_marca like %?1%")
   List<Producto> buscarPorMarca(String nombreMarca);
     
}
