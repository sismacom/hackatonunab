/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.PuntoDeVenta;
import com.ejemplo.tiendaalamano.service.IPuntoDeVentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SISMACOM
 */
@RestController
@RequestMapping("/api/puntoventa")
public class PuntoDeVentaController {

    @Autowired
    private IPuntoDeVentaService puntoServ;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public PuntoDeVenta save(@RequestBody PuntoDeVenta puntoventa) {
        return puntoServ.save(puntoventa);
    }

    @GetMapping("/buscar/{id}")
    public PuntoDeVenta findById(@PathVariable Long id) {
        return puntoServ.findByID(id);
    }

    @GetMapping("/listartodos")
    public List<PuntoDeVenta> findAll() {
        return puntoServ.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        puntoServ.deleteById(id);
    }

}
