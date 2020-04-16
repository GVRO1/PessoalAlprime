

import java.util.List;
import java.util.Objects;

public class Localizacao {
    private Integer id_localizacao;
    private String nome_localizacao;
    private String tipo_linha;
    private String endereco;
    private List<Maquina> maquinas;
    public Localizacao(Integer id_localizacao, String nome_localizacao, String tipo_linha, String endereco, List<Maquina> maquinas) {
        this.id_localizacao = id_localizacao;
        this.nome_localizacao = nome_localizacao;
        this.tipo_linha = tipo_linha;
        this.endereco = endereco;
        this.maquinas = maquinas;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public Localizacao() {
    }

    public Integer getId_localizacao() {
        return id_localizacao;
    }

    public void setId_localizacao(Integer id_localizacao) {
        this.id_localizacao = id_localizacao;
    }

    public String getNome_localizacao() {
        return nome_localizacao;
    }

    public void setNome_localizacao(String nome_localizacao) {
        this.nome_localizacao = nome_localizacao;
    }

    public String getTipo_linha() {
        return tipo_linha;
    }

    public void setTipo_linha(String tipo_linha) {
        this.tipo_linha = tipo_linha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localizacao that = (Localizacao) o;
        return Objects.equals(id_localizacao, that.id_localizacao) &&
                Objects.equals(nome_localizacao, that.nome_localizacao) &&
                Objects.equals(tipo_linha, that.tipo_linha) &&
                Objects.equals(endereco, that.endereco) &&
                Objects.equals(maquinas, that.maquinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_localizacao, nome_localizacao, tipo_linha, endereco, maquinas);
    }
}
