/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author SISMACOM
 */
@Entity
@Table(name = "puntosdeventa")
public class PuntoDeVenta extends EntidadBase {

    private String nombre_puntoventa;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String coordenadas;

    @OneToMany(mappedBy = "puntoVenta")
    @JsonIgnoreProperties(value = {"puntoVenta", "hibernateLazyInicializer", "handler"}, allowSetters = true)
    private List<Producto> productos;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getNombre_puntoventa() {
        return nombre_puntoventa;
    }

    public void setNombre_puntoventa(String nombre_puntoventa) {
        this.nombre_puntoventa = nombre_puntoventa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return nombre_puntoventa;
    }

}
