import java.util.Objects;

public class Registro {
    private Integer id_registro;
    private String data_hota;
    private Integer porc_processador;
    private Integer porc_disco;
    private Integer porc_memoria;
    private Maquina maquina;

    public Registro(Integer id_registro, String data_hota, Integer porc_processador, Integer porc_disco, Integer porc_memoria, Maquina maquina) {
        this.id_registro = id_registro;
        this.data_hota = data_hota;
        this.porc_processador = porc_processador;
        this.porc_disco = porc_disco;
        this.porc_memoria = porc_memoria;
        this.maquina = maquina;
    }

    public Registro() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro that = (Registro) o;
        return Objects.equals(id_registro, that.id_registro) &&
                Objects.equals(data_hota, that.data_hota) &&
                Objects.equals(porc_processador, that.porc_processador) &&
                Objects.equals(porc_disco, that.porc_disco) &&
                Objects.equals(porc_memoria, that.porc_memoria) &&
                Objects.equals(maquina, that.maquina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_registro, data_hota, porc_processador, porc_disco, porc_memoria, maquina);
    }

    public Integer getId_registro() {
        return id_registro;
    }

    public void setId_registro(Integer id_registro) {
        this.id_registro = id_registro;
    }

    public String getData_hota() {
        return data_hota;
    }

    public void setData_hota(String data_hota) {
        this.data_hota = data_hota;
    }

    public Integer getPorc_processador() {
        return porc_processador;
    }

    public void setPorc_processador(Integer porc_processador) {
        this.porc_processador = porc_processador;
    }

    public Integer getPorc_disco() {
        return porc_disco;
    }

    public void setPorc_disco(Integer porc_disco) {
        this.porc_disco = porc_disco;
    }

    public Integer getPorc_memoria() {
        return porc_memoria;
    }

    public void setPorc_memoria(Integer porc_memoria) {
        this.porc_memoria = porc_memoria;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "Registro{" + "id_registro=" + id_registro + ", data_hota=" + data_hota + ", porc_processador=" + porc_processador + ", porc_disco=" + porc_disco + ", porc_memoria=" + porc_memoria + ", maquina=" + maquina + '}';
    }
    
    
}
