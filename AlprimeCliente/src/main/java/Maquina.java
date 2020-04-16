

import java.util.List;

public class Maquina {

    private Integer id_maquina;
    private String tipo_processador;
    private String sistema_operacional;
    private Double capacidade_memoria;
    private Integer fk_localizacao;
    private List<Registro> registros;

    public Maquina() {
    }

    public Maquina(Integer id_maquina, String tipo_processador, String sistema_operacional, Double capacidade_memoria, Integer fk_localizacao, List<Registro> registros) {
        this.id_maquina = id_maquina;
        this.tipo_processador = tipo_processador;
        this.sistema_operacional = sistema_operacional;
        this.capacidade_memoria = capacidade_memoria;
        this.fk_localizacao = fk_localizacao;
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

    public Integer getFk_localizacao() {
        return fk_localizacao;
    }

    public void setFk_localizacao(Integer fk_localizacao) {
        this.fk_localizacao = fk_localizacao;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        return "Maquina{" + "id_maquina=" + id_maquina + ", tipo_processador=" + tipo_processador + ", sistema_operacional=" + sistema_operacional + ", capacidade_memoria=" + capacidade_memoria + ", fk_localizacao=" + fk_localizacao + ", registros=" + registros + '}';
    }

    
    
 
    
}
