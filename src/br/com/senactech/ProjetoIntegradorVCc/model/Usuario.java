/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.model;

/**
 *
 * @author User
 */
public class Usuario {

    private int idUsuario;
    private boolean status;
    private String endereco;
    private String nome;
    private String telefone;
    private String email;
    private String cep;
    private String cpf;
    private String senha;

    public Usuario() {

    }

    public Usuario(int idUsuario, boolean status, String endereco, String nome, String telefone, String email, String cep, String cpf, String senha) {
        this.idUsuario = idUsuario;
        this.status = status;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.cpf = cpf;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", status=" + status + ", endereco=" + endereco + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", cep=" + cep + ", cpf=" + cpf + ", senha=" + senha + '}';
    }

}
