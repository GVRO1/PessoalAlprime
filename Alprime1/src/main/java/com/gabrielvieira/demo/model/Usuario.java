package com.gabrielvieira.demo.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    private Integer id_usuario;
    @Column(name = "nome_usuario")
    private String nome_usuario;
    @Column(name = "cpf_usuario")
    private String cpf_usuario;
    @Column(name = "email_usuario")
    private String email_usuario;
    @Column(name = "senha_usuario")
    private String senha_usuario;
    @Column(name = "telefone")
    private String telefone;
    @OneToMany(mappedBy = "usuario")
    private List<Localizacao> localizacao;

    public Usuario() {
    }

    public Usuario(Integer id_usuario, String nome_usuario, String cpf_usuario, String email_usuario, String senha_usuario, String telefone, List<Localizacao> localizacao) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.cpf_usuario = cpf_usuario;
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
        this.telefone = telefone;
        this.localizacao = localizacao;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Localizacao> getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(List<Localizacao> localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id_usuario);
        hash = 37 * hash + Objects.hashCode(this.nome_usuario);
        hash = 37 * hash + Objects.hashCode(this.cpf_usuario);
        hash = 37 * hash + Objects.hashCode(this.email_usuario);
        hash = 37 * hash + Objects.hashCode(this.senha_usuario);
        hash = 37 * hash + Objects.hashCode(this.telefone);
        hash = 37 * hash + Objects.hashCode(this.localizacao);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome_usuario, other.nome_usuario)) {
            return false;
        }
        if (!Objects.equals(this.cpf_usuario, other.cpf_usuario)) {
            return false;
        }
        if (!Objects.equals(this.email_usuario, other.email_usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha_usuario, other.senha_usuario)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.id_usuario, other.id_usuario)) {
            return false;
        }
        if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nome_usuario=" + nome_usuario + ", cpf_usuario=" + cpf_usuario + ", email_usuario=" + email_usuario + ", senha_usuario=" + senha_usuario + ", telefone=" + telefone + ", localizacao=" + localizacao + '}';
    }

}
