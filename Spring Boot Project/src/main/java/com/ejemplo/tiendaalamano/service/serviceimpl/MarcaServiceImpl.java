/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service.serviceimpl;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.repository.IMarcaRepository;
import com.ejemplo.tiendaalamano.service.IMarcaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SISMACOM
 */
@Service("marcaService")
public class MarcaServiceImpl implements IMarcaService {

    @Autowired
    private IMarcaRepository marcaRepo;

    @Override
    @Transactional(readOnly = true)
    public Marca findById(Long id) {
        return marcaRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Marca> findAll() {
        return marcaRepo.findAll();
    }

    @Override
    @Transactional
    public Marca save(Marca marca) {
        return marcaRepo.save(marca);
    }

    @Override
    public void deleteById(Long id) {
        marcaRepo.deleteById(id);
    }

}
