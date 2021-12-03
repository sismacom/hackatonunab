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
import javax.persistence.Table;

/**
 *
 * @author SISMACOM
 */
@Entity
@Table(name = "productos")
public class Producto extends EntidadBase {

    private int codigo;
    private String nombreProducto;
    private double valorProducto;
    private String descripcionProdcuto;
    private int cantidadStock;

    @ManyToOne
    private PuntoDeVenta puntoVenta;

    @ManyToOne
    private Marca marca;

    @ManyToOne
    private Categoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<ComentarioProducto> comentarioProductos;

    public List<ComentarioProducto> getComentarioProductos() {
        return comentarioProductos;
    }

    public void setComentarioProductos(List<ComentarioProducto> comentarioProductos) {
        this.comentarioProductos = comentarioProductos;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public PuntoDeVenta getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(PuntoDeVenta puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(double valorProducto) {
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
