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
@Table(name = "domiciliarios")
public class Domiciliario extends EntidadBase {

    private String nombreDomi;
    private String telefono;
    

    public String getNombreDomi() {
        return nombreDomi;
    }

    public void setNombreDomi(String nombreDomi) {
        this.nombreDomi = nombreDomi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombreDomi;
    }

}
