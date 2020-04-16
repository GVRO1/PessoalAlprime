package com.gabrielvieira.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "localizacao")
public class Localizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localizacao")
    private Integer id_localizacao;
    @Column(name = "nome_localizacao")
    private String nome_localizacao;
    @Column(name = "tipo_linha")
    private String tipo_linha;
    @Column(name = "endereco")
    private String endereco;
    @OneToMany(mappedBy = "localizacao")
    private List<Maquina> maquinas;

    public Localizacao() {
    }

    public Localizacao(Integer id_localizacao, String nome_localizacao, String tipo_linha, String endereco, List<Maquina> maquinas) {
        this.id_localizacao = id_localizacao;
        this.nome_localizacao = nome_localizacao;
        this.tipo_linha = tipo_linha;
        this.endereco = endereco;
        this.maquinas = maquinas;
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

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id_localizacao);
        hash = 53 * hash + Objects.hashCode(this.nome_localizacao);
        hash = 53 * hash + Objects.hashCode(this.tipo_linha);
        hash = 53 * hash + Objects.hashCode(this.endereco);
        hash = 53 * hash + Objects.hashCode(this.maquinas);
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
        final Localizacao other = (Localizacao) obj;
        if (!Objects.equals(this.nome_localizacao, other.nome_localizacao)) {
            return false;
        }
        if (!Objects.equals(this.tipo_linha, other.tipo_linha)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.id_localizacao, other.id_localizacao)) {
            return false;
        }
        if (!Objects.equals(this.maquinas, other.maquinas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Localizacao{" + "id_localizacao=" + id_localizacao + ", nome_localizacao=" + nome_localizacao + ", tipo_linha=" + tipo_linha + ", endereco=" + endereco + ", maquinas=" + maquinas + '}';
    }

}