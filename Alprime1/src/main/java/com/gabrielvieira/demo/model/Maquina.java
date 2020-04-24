package com.gabrielvieira.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "maquina")
public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_maquina")
    private Integer id_maquina;

    @Column (name = "numero_serial")
    private String numero_serial;
    
    @Column(name = "tipo_processador")
    private String tipo_processador;

    @Column(name = "sistema_operacional")
    private String sistema_operacional;

    @Column (name = "hostname")
    private String hostname;
    
    @Column(name = "capacidade_memoria")
    private Double capacidade_memoria;

    @Column (name = "status")
    private boolean status;
    
    @Column (name = "fabricante")
    private String fabricante;
    
    @Column (name = "modelo")
    private String modelo;
 
    @Column (name = "ram_total")
    private Double ram_total;
    
  
    @OneToMany(mappedBy = "maquina")
    private List<Registro> registros;

    @ManyToOne
    @JoinColumn(name = "fk_localizacao")
    @JsonIgnore
    private Localizacao localizacao;

    public Maquina() {
    }

    public Maquina(Integer id_maquina, String numero_serial, String tipo_processador, String sistema_operacional, String hostname, Double capacidade_memoria, boolean status, String fabricante, String modelo, Double ram_total, List<Registro> registros, Localizacao localizacao) {
        this.id_maquina = id_maquina;
        this.numero_serial = numero_serial;
        this.tipo_processador = tipo_processador;
        this.sistema_operacional = sistema_operacional;
        this.hostname = hostname;
        this.capacidade_memoria = capacidade_memoria;
        this.status = status;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ram_total = ram_total;
        this.registros = registros;
        this.localizacao = localizacao;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getRam_total() {
        return ram_total;
    }

    public void setRam_total(Double ram_total) {
        this.ram_total = ram_total;
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

    public String getNumero_serial() {
        return numero_serial;
    }

    public void setNumero_serial(String numero_serial) {
        this.numero_serial = numero_serial;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id_maquina);
        hash = 29 * hash + Objects.hashCode(this.numero_serial);
        hash = 29 * hash + Objects.hashCode(this.tipo_processador);
        hash = 29 * hash + Objects.hashCode(this.sistema_operacional);
        hash = 29 * hash + Objects.hashCode(this.hostname);
        hash = 29 * hash + Objects.hashCode(this.capacidade_memoria);
        hash = 29 * hash + (this.status ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.fabricante);
        hash = 29 * hash + Objects.hashCode(this.modelo);
        hash = 29 * hash + Objects.hashCode(this.ram_total);
        hash = 29 * hash + Objects.hashCode(this.registros);
        hash = 29 * hash + Objects.hashCode(this.localizacao);
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
        final Maquina other = (Maquina) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.numero_serial, other.numero_serial)) {
            return false;
        }
        if (!Objects.equals(this.tipo_processador, other.tipo_processador)) {
            return false;
        }
        if (!Objects.equals(this.sistema_operacional, other.sistema_operacional)) {
            return false;
        }
        if (!Objects.equals(this.hostname, other.hostname)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.id_maquina, other.id_maquina)) {
            return false;
        }
        if (!Objects.equals(this.capacidade_memoria, other.capacidade_memoria)) {
            return false;
        }
        if (!Objects.equals(this.ram_total, other.ram_total)) {
            return false;
        }
        if (!Objects.equals(this.registros, other.registros)) {
            return false;
        }
        if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Maquina{" + "id_maquina=" + id_maquina + ", numero_serial=" + numero_serial + ", tipo_processador=" + tipo_processador + ", sistema_operacional=" + sistema_operacional + ", hostname=" + hostname + ", capacidade_memoria=" + capacidade_memoria + ", status=" + status + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ram_total=" + ram_total + ", registros=" + registros + ", localizacao=" + localizacao + '}';
    }

    
    
    
    

    
}
