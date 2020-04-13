package com.gabrielvieira.demo;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PowerSource;
import oshi.software.os.OperatingSystem;

public class MaquinaAtual {
    public String proceNome;
    public Double proceUtilizado;
    public Double batRestante;
    public boolean batEstado;
    public Double memoriaRestante;
    public Double memoriaUtilizada;
    public Double memoriaTotal;
public String sistemaOperacional;

    public MaquinaAtual() {
        SystemInfo si = new SystemInfo();
        OperatingSystem op = si.getOperatingSystem();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor processor = hal.getProcessor();
        PowerSource[] bateria = hal.getPowerSources();

        long[] prevTicks = processor.getSystemCpuLoadTicks();
        this.sistemaOperacional = op.getVersionInfo().toString();
        this.proceNome = processor.toString().split("z")[0] + "z";
        this.proceUtilizado = processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100;
        if(bateria.length > 0) {
            this.batRestante = bateria[0].getRemainingCapacityPercent();
            this.batEstado = bateria[0].isCharging();
        }else{
            this.batRestante = 0.0;
            this.batEstado = false;
        }
        this.memoriaTotal = si.getHardware().getMemory().getTotal() / 1000000000.0;
        this.memoriaRestante = (si.getHardware().getMemory().getAvailable() / 1000000000.0) * 100 / memoriaTotal;
        this.memoriaUtilizada = 100 - memoriaRestante;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProceNome() {
        return proceNome;
    }

    public void setProceNome(String proceNome) {
        this.proceNome = proceNome;
    }

    public Double getProceUtilizado() {
        return proceUtilizado;
    }

    public void setProceUtilizado(Double proceUtilizado) {
        this.proceUtilizado = proceUtilizado;
    }

    public Double getBatRestante() {
        return batRestante;
    }

    public void setBatRestante(Double batRestante) {
        this.batRestante = batRestante;
    }

    public boolean isBatEstado() {
        return batEstado;
    }

    public void setBatEstado(boolean batEstado) {
        this.batEstado = batEstado;
    }

    public Double getMemoriaRestante() {
        return memoriaRestante;
    }

    public void setMemoriaRestante(Double memoriaRestante) {
        this.memoriaRestante = memoriaRestante;
    }

    public Double getMemoriaUtilizada() {
        return memoriaUtilizada;
    }

    public void setMemoriaUtilizada(Double memoriaUtilizada) {
        this.memoriaUtilizada = memoriaUtilizada;
    }

    public Double getMemoriaTotal() {
        return memoriaTotal;
    }

    public void setMemoriaTotal(Double memoriaTotal) {
        this.memoriaTotal = memoriaTotal;
    }


}
