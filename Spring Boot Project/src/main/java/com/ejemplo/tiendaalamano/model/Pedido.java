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
@Table(name = "pedidos")
public class Pedido extends EntidadBase {

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Venta venta;

    private double costoEnvio;
    private String fechaPosibleEntrega;
    private double puntos;

    @OneToOne(mappedBy = "pedido")
    private PQR pQR;

    @OneToOne
    private Calificacion calificacion;

    @OneToOne
    private OrdenDeEntrega ordenEntrega;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public OrdenDeEntrega getOrdenEntrega() {
        return ordenEntrega;
    }

    public void setOrdenEntrega(OrdenDeEntrega ordenEntrega) {
        this.ordenEntrega = ordenEntrega;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getFechaPosibleEntrega() {
        return fechaPosibleEntrega;
    }

    public void setFechaPosibleEntrega(String fechaPosibleEntrega) {
        this.fechaPosibleEntrega = fechaPosibleEntrega;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public PQR getpQR() {
        return pQR;
    }

    public void setpQR(PQR pQR) {
        this.pQR = pQR;
    }

}
