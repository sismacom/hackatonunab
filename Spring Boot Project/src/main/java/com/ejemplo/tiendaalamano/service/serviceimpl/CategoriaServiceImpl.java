/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service.serviceimpl;

import com.ejemplo.tiendaalamano.model.Categoria;
import com.ejemplo.tiendaalamano.repository.ICategoriaRepository;
import com.ejemplo.tiendaalamano.service.ICategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SISMACOM
 */
@Service("categoriaService")
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaRepository catRepo;

    @Override
    @Transactional(readOnly = true)
    public Categoria findByID(Long id) {
        return catRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> findAll() {
        return catRepo.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        catRepo.deleteById(id);
    }

    @Override
    @Transactional
    public Categoria save(Categoria categoria) {
        return catRepo.save(categoria);
    }

}
