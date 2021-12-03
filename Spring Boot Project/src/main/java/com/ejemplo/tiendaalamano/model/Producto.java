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
@Table(name="productos")
public class Producto extends EntidadBase{
    
    private String nombreProducto;
    private String marcaProdcuto;
    private String valorProducto;
    private String descripcionProdcuto;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProdcuto() {
        return marcaProdcuto;
    }

    public void setMarcaProdcuto(String marcaProdcuto) {
        this.marcaProdcuto = marcaProdcuto;
    }

    public String getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(String valorProducto) {
        this.valorProducto = valorProducto;
    }

    public String getDescripcionProdcuto() {
        return descripcionProdcuto;
    }

    public void setDescripcionProdcuto(String descripcionProdcuto) {
        this.descripcionProdcuto = descripcionProdcuto;
    }

    @Override
    public String toString() {
        return this.nombreProducto;
    }
    
    
    
}
