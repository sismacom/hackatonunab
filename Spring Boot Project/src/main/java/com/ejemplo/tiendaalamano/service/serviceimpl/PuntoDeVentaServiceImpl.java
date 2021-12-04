/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service.serviceimpl;

import com.ejemplo.tiendaalamano.model.PuntoDeVenta;
import com.ejemplo.tiendaalamano.repository.IPuntoDeVentaRepository;
import com.ejemplo.tiendaalamano.service.IPuntoDeVentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SISMACOM
 */
@Service("puntoVentaService")
public class PuntoDeVentaServiceImpl implements IPuntoDeVentaService {

    @Autowired
    private IPuntoDeVentaRepository puntoRepo;

    @Override
    @Transactional
    public PuntoDeVenta save(PuntoDeVenta puntodeventa) {
        return puntoRepo.save(puntodeventa);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PuntoDeVenta> findAll() {
        return puntoRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PuntoDeVenta findByID(Long id) {
        return puntoRepo.getById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        puntoRepo.deleteById(id);
    }
}
