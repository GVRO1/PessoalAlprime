package com.gabrielvieira.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private Integer id_registro;
    @Column(name = "data_hora")
    private String data_hora;
    @Column(name = "porc_processador")
    private Integer porc_processador;
    @Column(name = "porc_disco")
    private Integer porc_disco;
    @Column(name = "porc_memoria")
    private Integer porc_memoria;
    
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "fk_maquina")
    private Maquina maquina;

    public Registro() {
    }

    public Registro(Integer id_registro, String data_hora, Integer porc_processador, Integer porc_disco, Integer porc_memoria, Maquina maquina) {
    this.id_registro = id_registro;
    this.data_hora = data_hora;
    this.porc_processador = porc_processador;
    this.porc_disco = porc_disco;
    this.porc_memoria = porc_memoria;
    this.maquina = maquina;
    }

    public Integer getIdRegistro() {
        return id_registro;
    }

    public void setIdRegistro(Integer id_registro) {
        this.id_registro = id_registro;
    }

    public String getDataHora() {
        return data_hora;
    }

    public void setDataHora(String data_hora) {
        this.data_hora = data_hora;
    }

    public Integer getPorcProcessador() {
        return porc_processador;
    }

    public void setPorcProcessador(Integer porc_processador) {
        this.porc_processador = porc_processador;
    }

    public Integer getPorcDisco() {
        return porc_disco;
    }

    public void setPorcDisco(Integer porc_disco) {
        this.porc_disco = porc_disco;
    }

    public Integer getPorcMemoria() {
        return porc_memoria;
    }

    public void setPorcMemoria(Integer porc_memoria) {
        this.porc_memoria = porc_memoria;
    }

   

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
}
