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
    private Double porc_processador;
    @Column(name = "porc_disco")
    private Double porc_disco;
    @Column(name = "porc_memoria")
    private Double porc_memoria;
    @Column(name = "temp_cpu")
    private Double temp_cpu;
    @Column(name = "porc_ram")
    private Double porc_ram;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "fk_maquina")
    private Maquina maquina;

    public Registro() {
    }

    public Registro(Integer id_registro, String data_hora, Double porc_processador, Double porc_disco, Double porc_memoria, Double temp_cpu,Double porc_ram ,Maquina maquina) {
        this.id_registro = id_registro;
        this.data_hora = data_hora;
        this.porc_processador = porc_processador;
        this.porc_disco = porc_disco;
        this.porc_memoria = porc_memoria;
        this.temp_cpu = temp_cpu;
        this.porc_ram = porc_ram;
        this.maquina = maquina;
    }

    public Integer getId_registro() {
        return id_registro;
    }

    public void setId_registro(Integer id_registro) {
        this.id_registro = id_registro;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public Double getPorc_processador() {
        return porc_processador;
    }

    public void setPorc_processador(Double porc_processador) {
        this.porc_processador = porc_processador;
    }

    public Double getPorc_disco() {
        return porc_disco;
    }

    public void setPorc_disco(Double porc_disco) {
        this.porc_disco = porc_disco;
    }

    public Double getPorc_memoria() {
        return porc_memoria;
    }

    public void setPorc_memoria(Double porc_memoria) {
        this.porc_memoria = porc_memoria;
    }

    public Double getTemp_cpu() {
        return temp_cpu;
    }

    public void setTemp_cpu(Double temp_cpu) {
        this.temp_cpu = temp_cpu;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Double getPorc_ram() {
        return porc_ram;
    }

    public void setPorc_ram(Double porc_ram) {
        this.porc_ram = porc_ram;
    }

    @Override
    public String toString() {
        return "Registro{" + "id_registro=" + id_registro + ", data_hora=" + data_hora + ", porc_processador=" + porc_processador + ", porc_disco=" + porc_disco + ", porc_memoria=" + porc_memoria + ", temp_cpu=" + temp_cpu + ", porc_ram=" + porc_ram + ", maquina=" + maquina + '}';
    }
    
    

   

   
}
