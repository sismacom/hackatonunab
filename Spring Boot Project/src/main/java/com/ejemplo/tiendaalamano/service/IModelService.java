package com.ejemplo.tiendaalamano.service;

import java.util.List;

import com.ejemplo.tiendaalamano.model.Model;

public interface IModelService {
    void deleteAllModels();
    void deleteModelById(Long id);

    void createModel(Model model);

    Model getModelById(Long id);

    List<Model> getAllModels();
}
