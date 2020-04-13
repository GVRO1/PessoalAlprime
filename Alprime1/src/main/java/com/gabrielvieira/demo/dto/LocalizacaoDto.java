package com.gabrielvieira.demo.dto;

import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Maquina;
import com.gabrielvieira.demo.model.Usuario;

import java.util.List;
import java.util.Objects;

public class LocalizacaoDto {
    private Integer id_localizacao;
    private String nome_localizacao;
    private String tipo_linha;
    private String endereco;
    private List<Maquina> maquinas;
    public LocalizacaoDto(Integer id_localizacao, String nome_localizacao, String tipo_linha, String endereco, List<Maquina> maquinas) {
        this.id_localizacao = id_localizacao;
        this.nome_localizacao = nome_localizacao;
        this.tipo_linha = tipo_linha;
        this.endereco = endereco;
        this.maquinas = maquinas;
    }

    public LocalizacaoDto(Localizacao entity) {
        this.id_localizacao = entity.getIdLocalizacao();
        this.nome_localizacao = entity.getNomeLocalizacao();
        this.tipo_linha = entity.getTipoLinha();
        this.endereco = entity.getEndereco();
        this.maquinas = entity.getMaquinas();
    }

    public Localizacao toEntity(){
        Localizacao entity = new Localizacao();
        entity.setIdLocalizacao(this.id_localizacao);
        entity.setEndereco(this.endereco);
        entity.setMaquinas(this.maquinas);
        entity.setNomeLocalizacao(this.nome_localizacao);
        entity.setTipoLinha(this.tipo_linha);
        return entity;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public LocalizacaoDto() {
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
        LocalizacaoDto that = (LocalizacaoDto) o;
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
