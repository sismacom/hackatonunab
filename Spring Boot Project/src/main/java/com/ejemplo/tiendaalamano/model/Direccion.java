/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author SISMACOM
 */
@Entity
@Table(name = "direcciones")
public class Direccion extends EntidadBase {

    @ManyToOne
    private Cliente cliente;

    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
