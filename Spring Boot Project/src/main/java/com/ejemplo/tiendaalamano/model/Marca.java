/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author SISMACOM
 */
@Entity
@Table(name = "marcas")
public class Marca extends EntidadBase {

    private String nombre_marca;
    
    /*@JsonIgnoreProperties(value = {"marca", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "marca")
    private List<Producto> productos;*/

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

   /* public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }*/

    @Override
    public String toString() {
        return this.nombre_marca;
    }

}
