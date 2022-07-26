/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.projetoIntegradorVCc.controller;

import java.util.ArrayList;
import br.com.senactech.ProjetoIntegradorVCc.model.Usuario;

/**
 *
 * @author User
 */
public class CUsuario {

    /**
     * Repositório de usuários.
     */
    ArrayList<Usuario> usuarios = new ArrayList<>();
    int idUsuario = 1;

    /**
     * Retorna todos os usuários cadastrados no sistema.
     *
     * @return
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public int addIdUsuario() {
        return this.idUsuario++;
    }

    public boolean addUsuario(Usuario u) {
        return this.usuarios.add(u);
    }

    public boolean removeUsuario(Usuario u) {
        return this.usuarios.remove(u);
    }

    public boolean verEmail(String email) {
        boolean verEmail = false;
        for (Usuario listU : usuarios) {
            if (listU.getEmail().equalsIgnoreCase(email)) {
                verEmail = true;
            }
            break;
        }
        return verEmail;
    }

    public boolean verSenha(String senha) {
        boolean verSenha = false;
        for (Usuario listU : usuarios) {
            if (listU.getSenha().equalsIgnoreCase(senha)) {
                verSenha = true;
            }
            break;
        }
        return verSenha;
    }

    /**
     * Método mok serve para poder fazer testes com cadastros pré-existentes.
     */
    public void mokUsuarios() {
        Usuario u1 = new Usuario();
        u1.setIdUsuario(this.addIdUsuario());
        u1.setNome("Felispino");
        u1.setEndereco("Av. Getúlio Vargas.");
        u1.setTelefone("51998765432");
        u1.setSenha("felispino12345");
        this.addUsuario(u1);

        Usuario u2 = new Usuario();
        u2.setIdUsuario(this.addIdUsuario());
        u2.setNome("Jorge");
        u2.setEndereco("Rua Rodolfo Ibira.");
        u2.setTelefone("51999999999");
        u2.setSenha("jorge456");
        this.addUsuario(u2);
    }

    public boolean verCpf(String cpf) {
        boolean verCpf = false;
        for (Usuario listUsuarios : usuarios) {
            if (listUsuarios.getCpf().equals(cpf)) {
                verCpf = true;
                break;
            }
        }
        return verCpf;
    }

    /**
     * Método mok serve para poder fazer testes com cadastros pré-existentes.
     */
    public void mokUsuario() {
        Usuario c1 = new Usuario(addIdUsuario(), true, "joao batista conzatti 459", "João Vitor Barbosa", "(51)99991-9750", "jvitorbf35@gmail.com", "92990-000", "93840920132", "123abc");
        this.addUsuario(c1);

    }

}
