package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario extends EntidadBase {

    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;

    //private static final long serialVersionUID = -5773962493781143007L;
    @Column(length = 25, nullable = false)
    private String username;

    @Column(length = 25, nullable = false)
    private String password;
    
    private String tipoUsuario;

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
