package com.gabrielvieira.demo.dto;

import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Maquina;
import com.gabrielvieira.demo.model.Registro;

import java.util.List;

public class MaquinaDto {

    private Integer id_maquina;
    private String numero_serial;
    private String tipo_processador;
    private String sistema_operacional;
    private String hostname;
    private Double capacidade_memoria;
    private boolean status;
    private String fabricante;
    private String modelo;
    private Double ram_total;
    private List<Registro> registros;
    private Localizacao localizacao;
    
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
            this.status = entity.isStatus();
            this.fabricante = entity.getFabricante();
            this.modelo = entity.getModelo();
            this.ram_total = entity.getRam_total();
            this.hostname = entity.getHostname();
            this.numero_serial = entity.getNumero_serial();
        }
    }

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
        maquina.setStatus(this.status);
        maquina.setFabricante(this.fabricante);
        maquina.setModelo(this.modelo);
        maquina.setRam_total(this.ram_total);
        maquina.setHostname(this.hostname);
        maquina.setNumero_serial(this.numero_serial);
        return  maquina;
    }

    public MaquinaDto(Integer id_maquina, String tipo_processador, String sistema_operacional,
            Double capacidade_memoria,boolean status, String hostname, String fabricante, String modelo,
            Double ram_total,Localizacao localizacao, List<Registro> registros, String numero_serial) {
        this.id_maquina = id_maquina;
        this.tipo_processador = tipo_processador;
        this.sistema_operacional = sistema_operacional;
        this.capacidade_memoria = capacidade_memoria;
        this.localizacao = localizacao;
        this.registros = registros;
        this.status = status;
        this.hostname = hostname;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ram_total = ram_total;
        this.numero_serial = numero_serial;
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

    public Double getRam_total() {
        return ram_total;
    }

    public void setRam_total(Double ram_total) {
        this.ram_total = ram_total;
    }

    @Override
    public String toString() {
        return "MaquinaDto{" + "id_maquina=" + id_maquina + ", numero_serial=" + numero_serial + ", tipo_processador=" + tipo_processador + ", sistema_operacional=" + sistema_operacional + ", hostname=" + hostname + ", capacidade_memoria=" + capacidade_memoria + ", status=" + status + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ram_total=" + ram_total + ", registros=" + registros + ", localizacao=" + localizacao + '}';
    }

    

    


   
}
