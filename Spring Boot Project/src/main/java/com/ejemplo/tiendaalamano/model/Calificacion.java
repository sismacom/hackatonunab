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
@Table(name = "calificaciones")
public class Calificacion extends EntidadBase {

    @OneToOne(mappedBy = "calificacion")
    private Pedido pedido;
    private String observacion;
    private int valorCalificado;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getValorCalificado() {
        return valorCalificado;
    }

    public void setValorCalificado(int valorCalificado) {
        this.valorCalificado = valorCalificado;
    }

}
