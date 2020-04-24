package com.mycompany.tabelas;


import java.time.LocalDateTime;
import java.util.Objects;
import com.mycompany.conexaoservidor.ClienteApi;
import com.mycompany.Oshi;

public class Registro {

    private Integer id_registro;
    private String data_hora;
    private Double porc_processador;
    private Double porc_disco;
    private Double porc_memoria;
    private Double temp_cpu;
    private Double porc_ram;
    private Maquina maquina;

    public Registro() {
    }

    public Registro(Integer id_registro, String data_hora, Double porc_processador, Double porc_disco, Double porc_memoria, Double temp_cpu, Double porc_ram, Maquina maquina) {
        this.id_registro = id_registro;
        this.data_hora = data_hora;
        this.porc_processador = porc_processador;
        this.porc_disco = porc_disco;
        this.porc_memoria = porc_memoria;
        this.temp_cpu = temp_cpu;
        this.porc_ram = porc_ram;
        this.maquina = maquina;
    }
    
    public Registro(Maquina maquina) {
        ClienteApi cliente = new ClienteApi();
        this.id_registro = cliente.getTotalRegistro();
        this.data_hora = LocalDateTime.now().toString();
        this.porc_ram = Oshi.monitorarRam();
        this.porc_disco = Oshi.monitorarDisco();      
        this.porc_processador = Oshi.monitorarCpu();
        this.temp_cpu = Oshi.monitorarTemperaturaJSensor();
        this.porc_memoria = Oshi.monitorarMemoria();
        this.maquina = maquina;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id_registro);
        hash = 29 * hash + Objects.hashCode(this.data_hora);
        hash = 29 * hash + Objects.hashCode(this.porc_processador);
        hash = 29 * hash + Objects.hashCode(this.porc_disco);
        hash = 29 * hash + Objects.hashCode(this.porc_memoria);
        hash = 29 * hash + Objects.hashCode(this.temp_cpu);
        hash = 29 * hash + Objects.hashCode(this.porc_ram);
        hash = 29 * hash + Objects.hashCode(this.maquina);
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
        final Registro other = (Registro) obj;
        if (!Objects.equals(this.data_hora, other.data_hora)) {
            return false;
        }
        if (!Objects.equals(this.id_registro, other.id_registro)) {
            return false;
        }
        if (!Objects.equals(this.porc_processador, other.porc_processador)) {
            return false;
        }
        if (!Objects.equals(this.porc_disco, other.porc_disco)) {
            return false;
        }
        if (!Objects.equals(this.porc_memoria, other.porc_memoria)) {
            return false;
        }
        if (!Objects.equals(this.temp_cpu, other.temp_cpu)) {
            return false;
        }
        if (!Objects.equals(this.porc_ram, other.porc_ram)) {
            return false;
        }
        if (!Objects.equals(this.maquina, other.maquina)) {
            return false;
        }
        return true;
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

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Double getTemp_cpu() {
        return temp_cpu;
    }

    public void setTemp_cpu(Double temp_cpu) {
        this.temp_cpu = temp_cpu;
    }

    public Double getPorc_ram() {
        return porc_ram;
    }

    public void setPorc_ram(Double porc_ram) {
        this.porc_ram = porc_ram;
    }

    @Override
    public String toString() {
        return "Registro{" + "id_registro=" + id_registro + ", data_hora=" + data_hora + ", porc_processador=" + porc_processador + ", porc_disco=" + porc_disco + ", porc_memoria=" + porc_memoria + ", temp_cpu=" + temp_cpu + ", porc_ram=" + porc_ram + ", maquina=" + maquina;
    }

}
