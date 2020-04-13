package com.gabrielvieira.demo.dto;

import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Maquina;
import com.gabrielvieira.demo.model.Registro;

import java.util.List;
import java.util.Objects;

public class MaquinaDto {


    public MaquinaDto() {
    }

    public MaquinaDto(Maquina entity) {
        if (entity != null){
            this.idMaquina = entity.getId_maquina();
            this.registros = entity.getRegistros();
            this.capacidadeMemoria = entity.getCapacidade_memoria();
            this.fkLocalizacao = entity.getLocalizacao().getIdLocalizacao();
            this.sistemaOperacional = entity.getSistema_operacional();
            this.tipoProcessador = entity.getTipo_processador();
        }
    }
    public MaquinaDto(Integer idMaquina, String tipoProcessador, String sistemaOperacional, Double capacidadeMemoria, Integer fkLocalizacao, List<Registro> registros) {
        this.idMaquina = idMaquina;
        this.tipoProcessador = tipoProcessador;
        this.sistemaOperacional = sistemaOperacional;
        this.capacidadeMemoria = capacidadeMemoria;
        this.fkLocalizacao = fkLocalizacao;
        this.registros = registros;
    }

    private Integer idMaquina;
    private String tipoProcessador;
    private String sistemaOperacional;
    private Double capacidadeMemoria;
    private Integer fkLocalizacao;
    private List<Registro> registros;

    public MaquinaDto(Object o) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaquinaDto that = (MaquinaDto) o;
        return Objects.equals(idMaquina, that.idMaquina) &&
                Objects.equals(tipoProcessador, that.tipoProcessador) &&
                Objects.equals(sistemaOperacional, that.sistemaOperacional) &&
                Objects.equals(capacidadeMemoria, that.capacidadeMemoria) &&
                Objects.equals(fkLocalizacao, that.fkLocalizacao) &&
                Objects.equals(registros, that.registros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMaquina, tipoProcessador, sistemaOperacional, capacidadeMemoria, fkLocalizacao, registros);
    }

    public Maquina toEntity() {
        Maquina maquina = new Maquina();
        Localizacao localizacao = new Localizacao();
        maquina.setId_maquina(this.idMaquina);
        maquina.setCapacidade_memoria(this.capacidadeMemoria);
        maquina.setSistema_operacional(this.sistemaOperacional);
        maquina.setTipo_processador(this.tipoProcessador);
        localizacao.setIdLocalizacao(this.fkLocalizacao);
        maquina.setLocalizacao(localizacao);
        maquina.setRegistros(this.registros);
        return  maquina;
    }

    public Integer getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public void setTipoProcessador(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Double getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(Double capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public Integer getFkLocalizacao() {
        return fkLocalizacao;
    }

    public void setFkLocalizacao(Integer fkLocalizacao) {
        this.fkLocalizacao = fkLocalizacao;
    }
}
