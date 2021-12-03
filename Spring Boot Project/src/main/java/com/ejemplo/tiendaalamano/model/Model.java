package com.ejemplo.tiendaalamano.model;

import javax.persistence.Entity;

@Entity
public class Model extends EntidadBase {

    private String name;

    public Model() {

    }

    public Model(Long id, String name) {

        this.setId(id);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
