package com.gabrielvieira.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "registro")
public class Registro {
    @Id
    @Column(name = "id_registro")
    private Integer idRegistro;
    @Column(name = "data_hora")
    private String dataHora;
    @Column(name = "porc_processador")
    private Integer porcProcessador;
    @Column(name = "porc_disco")
    private Integer porcDisco;
    @Column(name = "porc_memoria")
    private Integer porcMemoria;
    @ManyToOne
    @JoinColumn(name = "fk_maquina")
    private Maquina maquina;

    public Registro() {
    }

    public Registro(Integer idRegistro, String dataHora, Integer porcProcessador, Integer porcDisco, Integer porcMemoria, Maquina maquina) {
    this.idRegistro = idRegistro;
    this.dataHora = dataHora;
    this.porcProcessador = porcProcessador;
    this.porcDisco = porcDisco;
    this.porcMemoria = porcMemoria;
    this.maquina = maquina;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getPorcProcessador() {
        return porcProcessador;
    }

    public void setPorcProcessador(Integer porcProcessador) {
        this.porcProcessador = porcProcessador;
    }

    public Integer getPorcDisco() {
        return porcDisco;
    }

    public void setPorcDisco(Integer porcDisco) {
        this.porcDisco = porcDisco;
    }

    public Integer getPorcMemoria() {
        return porcMemoria;
    }

    public void setPorcMemoria(Integer porcMemoria) {
        this.porcMemoria = porcMemoria;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
}
