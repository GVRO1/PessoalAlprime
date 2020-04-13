package com.gabrielvieira.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "localizacao")
public class Localizacao {
    @Id
    @Column(name = "idLocalizacao")
    private Integer idLocalizacao;
    @Column(name = "nomeLocalizacao")
    private String nomeLocalizacao;
    @Column(name = "tipoLinha")
    private String tipoLinha;
    @Column(name = "endereco")
    private String endereco;
    @OneToMany(mappedBy = "localizacao", cascade = CascadeType.REMOVE)
    private List<Maquina> maquinas;

    public Localizacao() {
    }

    public Localizacao(Integer idLocalizacao, String nomeLocalizacao, String tipoLinha, String endereco, List<Maquina> maquinas ) {
    this.idLocalizacao = idLocalizacao;
    this.nomeLocalizacao = nomeLocalizacao;
    this.tipoLinha = tipoLinha;
    this.endereco = endereco;
    this.maquinas = maquinas;
    }

    public Integer getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Integer idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public String getNomeLocalizacao() {
        return nomeLocalizacao;
    }

    public void setNomeLocalizacao(String nomeLocalizacao) {
        this.nomeLocalizacao = nomeLocalizacao;
    }

    public String getTipoLinha() {
        return tipoLinha;
    }

    public void setTipoLinha(String tipoLinha) {
        this.tipoLinha = tipoLinha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinaRepositories) {
        this.maquinas = maquinaRepositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localizacao that = (Localizacao) o;
        return Objects.equals(idLocalizacao, that.idLocalizacao) &&
                Objects.equals(nomeLocalizacao, that.nomeLocalizacao) &&
                Objects.equals(tipoLinha, that.tipoLinha) &&
                Objects.equals(endereco, that.endereco) &&
                Objects.equals(maquinas, that.maquinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLocalizacao, nomeLocalizacao, tipoLinha, endereco, maquinas);
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "idLocalizacao=" + idLocalizacao +
                ", nomeLocalizacao='" + nomeLocalizacao + '\'' +
                ", tipoLinha='" + tipoLinha + '\'' +
                ", endereco='" + endereco + '\'' +
                ", maquinas=" + maquinas +
                '}';
    }
}
