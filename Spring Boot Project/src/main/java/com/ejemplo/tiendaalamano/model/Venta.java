/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author SISMACOM
 */
@Entity
@Table(name = "ventas")
public class Venta extends EntidadBase {

    @ManyToOne
    private Cliente cliente;

    private double valorTotalVenta;
    private double totalDescuento;
    private double totalIva;

    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detalleVentas;

    @OneToMany(mappedBy = "venta")
    private List<DetalleTipoPagoVenta> detalleTipoPagoVentas;

    @OneToOne(mappedBy = "venta")
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotalVenta() {
        return valorTotalVenta;
    }

    public void setValorTotalVenta(double valorTotalVenta) {
        this.valorTotalVenta = valorTotalVenta;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public List<DetalleTipoPagoVenta> getDetalleTipoPagoVentas() {
        return detalleTipoPagoVentas;
    }

    public void setDetalleTipoPagoVentas(List<DetalleTipoPagoVenta> detalleTipoPagoVentas) {
        this.detalleTipoPagoVentas = detalleTipoPagoVentas;
    }

}
