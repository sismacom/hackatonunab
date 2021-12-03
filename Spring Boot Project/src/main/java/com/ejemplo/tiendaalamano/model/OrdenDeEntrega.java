/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author SISMACOM
 */
@Entity
@Table(name = "ordenesdeentrega")
public class OrdenDeEntrega extends EntidadBase {

    @OneToOne(mappedBy = "ordenEntrega")
    private Pedido pedido;

    private Domiciliario domi;
    private String fechayhoraEntrega;
    private String estado;
    private String metodoEntrega;

    public Domiciliario getDomi() {
        return domi;
    }

    public void setDomi(Domiciliario domi) {
        this.domi = domi;
    }

    public String getFechayhoraEntrega() {
        return fechayhoraEntrega;
    }

    public void setFechayhoraEntrega(String fechayhoraEntrega) {
        this.fechayhoraEntrega = fechayhoraEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoEntrega() {
        return metodoEntrega;
    }

    public void setMetodoEntrega(String metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
    }

}
