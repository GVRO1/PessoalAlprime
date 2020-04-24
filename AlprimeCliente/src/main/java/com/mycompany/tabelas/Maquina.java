package com.mycompany.tabelas;

import java.util.List;
import com.mycompany.conexaoservidor.ClienteApi;
import com.mycompany.Oshi;

public class Maquina {

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

    ClienteApi cliente = new ClienteApi();

    public Maquina(Localizacao localizacao) {
        this.id_maquina = cliente.getTotalMaquina() + 1;
        this.fabricante = Oshi.capturarFabricante();
        this.modelo = Oshi.capturarModelo();
        this.tipo_processador = Oshi.capturarNomeProcessador();
        this.ram_total = Oshi.capturarRamTotal();
        this.sistema_operacional = Oshi.capturarSO();
        this.status = true;
        this.capacidade_memoria = Oshi.capturarMemoriaTotal();
        this.localizacao = localizacao;
        this.hostname = null;
        this.numero_serial = null;
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

    public Maquina() {
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

    public Localizacao getlocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
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
    public String toString() {
        return "Maquina{" + "id_maquina=" + id_maquina + ", numero_serial=" + numero_serial + ", tipo_processador=" + tipo_processador + ", sistema_operacional=" + sistema_operacional + ", hostname=" + hostname + ", capacidade_memoria=" + capacidade_memoria + ", status=" + status + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ram_total=" + ram_total + ", registros=" + registros + ", localizacao=" + localizacao + '}';
    }

}
