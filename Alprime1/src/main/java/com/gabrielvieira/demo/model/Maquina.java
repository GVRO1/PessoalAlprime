package com.gabrielvieira.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "maquina")
public class Maquina {

    @Id
    @Column(name = "id_maquina")
    private Integer id_maquina;

    @Column(name = "tipo_processador")
    public String tipo_processador;

    @Column(name = "sistema_operacional")
    public String sistema_operacional;

    @Column(name = "capacidade_memoria")
    public Double capacidade_memoria;

    @OneToMany(mappedBy = "maquina", cascade = CascadeType.REMOVE)
    @JsonIgnore
    public List<Registro> registros;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "fk_localizacao",nullable = false)
    public Localizacao localizacao;

    public Maquina() {
    }

    public Maquina(Integer id_maquina, String tipo_processador, String sistema_operacional, Double capacidade_memoria, List<Registro> registros, Localizacao localizacao) {
        this.id_maquina = id_maquina;
        this.tipo_processador = tipo_processador;
        this.sistema_operacional = sistema_operacional;
        this.capacidade_memoria = capacidade_memoria;
        this.registros = registros;
        this.localizacao = localizacao;
    }

    public Integer getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(Integer idMaquina) {
        this.id_maquina = idMaquina;
    }

    public String getTipo_processador() {
        return tipo_processador;
    }

    public void setTipo_processador(String tipoProcessador) {
        this.tipo_processador = tipoProcessador;
    }

    public String getSistema_operacional() {
        return sistema_operacional;
    }

    public void setSistema_operacional(String sistemaOperacional) {
        this.sistema_operacional = sistemaOperacional;
    }

    public Double getCapacidade_memoria() {
        return capacidade_memoria;
    }

    public void setCapacidade_memoria(Double capacidadeMemoria) {
        this.capacidade_memoria = capacidadeMemoria;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maquina maquina = (Maquina) o;
        return Objects.equals(id_maquina, maquina.id_maquina) &&
                Objects.equals(tipo_processador, maquina.tipo_processador) &&
                Objects.equals(sistema_operacional, maquina.sistema_operacional) &&
                Objects.equals(capacidade_memoria, maquina.capacidade_memoria) &&
                Objects.equals(registros, maquina.registros) &&
                Objects.equals(localizacao, maquina.localizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_maquina, tipo_processador, sistema_operacional, capacidade_memoria, registros, localizacao);
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "id_maquina=" + id_maquina +
                ", tipo_processador='" + tipo_processador + '\'' +
                ", sistema_operacional='" + sistema_operacional + '\'' +
                ", capacidade_memoria=" + capacidade_memoria +
                ", registros=" + registros +
                ", localizacao=" + localizacao +
                '}';
    }
}
