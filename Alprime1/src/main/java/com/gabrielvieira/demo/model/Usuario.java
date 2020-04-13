package com.gabrielvieira.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Usuario {
    @Id
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    @Column(name = "cpfUsuario")
    private String cpfUsuario;
    @Column(name = "emailUsuario")
    private String emailUsuario;
    @Column(name = "senhaUsuario")
    private String senhaUsuario;
    @Column(name = "tipoUsuario")
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nomeUsuario, String cpfUsuario, String emailUsuario, String senhaUsuario, String tipoUsuario){
    this.nomeUsuario = nomeUsuario;
    this.cpfUsuario = cpfUsuario;
    this.emailUsuario = emailUsuario;
    this.senhaUsuario = senhaUsuario;
    this.tipoUsuario = tipoUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
