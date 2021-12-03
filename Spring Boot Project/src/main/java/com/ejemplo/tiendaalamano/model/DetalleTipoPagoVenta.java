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
@Table(name = "detalletipopagoventa")
public class DetalleTipoPagoVenta extends EntidadBase {

    @ManyToOne
    private Venta venta;

    @ManyToOne
    private TipoPago tipopago;

    private double valor;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public TipoPago getTipopago() {
        return tipopago;
    }

    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
