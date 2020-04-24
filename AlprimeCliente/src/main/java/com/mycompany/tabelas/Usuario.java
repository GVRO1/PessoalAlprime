/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tabelas;

/**
 *
 * @author Gabriel Vieira
 */
public class Usuario {
    private Integer id_usuario;
    private String nome_usuario;
    private String cpf_usuario;
    private String email_usuario;
    private String senha_usuario;
    private String telefone;

    public Usuario(Integer id_usuario, String nome_usuario, String cpf_usuario, String email_usuario, String senha_usuario, String telefone) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.cpf_usuario = cpf_usuario;
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
        this.telefone = telefone;
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

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nome_usuario=" + nome_usuario + ", cpf_usuario=" + cpf_usuario + ", email_usuario=" + email_usuario + ", senha_usuario=" + senha_usuario + ", telefone=" + telefone + '}';
    }
    
    
}
