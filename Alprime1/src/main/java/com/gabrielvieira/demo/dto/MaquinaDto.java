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
            this.id_maquina = entity.getId_maquina();
            this.registros = entity.getRegistros();
            this.capacidade_memoria = entity.getCapacidade_memoria();
            this.localizacao = entity.getLocalizacao();
            this.sistema_operacional = entity.getSistema_operacional();
            this.tipo_processador = entity.getTipo_processador();
        }
    }

    private Integer id_maquina;
    private String tipo_processador;
    private String sistema_operacional;
    private Double capacidade_memoria;
    private Localizacao localizacao;
    private List<Registro> registros;

    public MaquinaDto(Object o) {
    }

    public Maquina toEntity() {
        Maquina maquina = new Maquina();
        maquina.setId_maquina(this.id_maquina);
        maquina.setCapacidade_memoria(this.capacidade_memoria);
        maquina.setSistema_operacional(this.sistema_operacional);
        maquina.setTipo_processador(this.tipo_processador);
        maquina.setLocalizacao(this.localizacao);
        maquina.setRegistros(this.registros);
        return  maquina;
    }

    public MaquinaDto(Integer id_maquina, String tipo_processador, String sistema_operacional, Double capacidade_memoria, Localizacao localizacao, List<Registro> registros) {
        this.id_maquina = id_maquina;
        this.tipo_processador = tipo_processador;
        this.sistema_operacional = sistema_operacional;
        this.capacidade_memoria = capacidade_memoria;
        this.localizacao = localizacao;
        this.registros = registros;
    }

    public Integer getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(Integer id_maquina) {
        this.id_maquina = id_maquina;
    }

    public String getTipo_processador() {
        return tipo_processador;
    }

    public void setTipo_processador(String tipo_processador) {
        this.tipo_processador = tipo_processador;
    }

    public String getSistema_operacional() {
        return sistema_operacional;
    }

    public void setSistema_operacional(String sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    public Double getCapacidade_memoria() {
        return capacidade_memoria;
    }

    public void setCapacidade_memoria(Double capacidade_memoria) {
        this.capacidade_memoria = capacidade_memoria;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id_maquina);
        hash = 67 * hash + Objects.hashCode(this.tipo_processador);
        hash = 67 * hash + Objects.hashCode(this.sistema_operacional);
        hash = 67 * hash + Objects.hashCode(this.capacidade_memoria);
        hash = 67 * hash + Objects.hashCode(this.localizacao);
        hash = 67 * hash + Objects.hashCode(this.registros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaquinaDto other = (MaquinaDto) obj;
        if (!Objects.equals(this.tipo_processador, other.tipo_processador)) {
            return false;
        }
        if (!Objects.equals(this.sistema_operacional, other.sistema_operacional)) {
            return false;
        }
        if (!Objects.equals(this.id_maquina, other.id_maquina)) {
            return false;
        }
        if (!Objects.equals(this.capacidade_memoria, other.capacidade_memoria)) {
            return false;
        }
        if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        if (!Objects.equals(this.registros, other.registros)) {
            return false;
        }
        return true;
    }

   
}
