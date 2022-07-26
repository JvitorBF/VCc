/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.DAO;

import br.com.senactech.ProjetoIntegradorVCc.conexao.Conexao;
import br.com.senactech.ProjetoIntegradorVCc.model.Usuario;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author João Vitor
 */
public class UsuarioDAO {

    // cadastrar
    public void cadastrarUsuario(Usuario uVO) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "insert into usuario (id,nome,telefone,email,cpf,cep,endereco,senha) values (null, '"
                    + uVO.getNome() + "','" + uVO.getTelefone()+ "','"
                    + uVO.getEmail() + "','" + uVO.getCpf() + "','"
                    + uVO.getCep() + "','" + uVO.getEndereco() + "','"
                    + uVO.getSenha() + "')";
            System.out.println(sql);
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar usuário!" + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    // encontrar usuario 
    public Usuario getByUsuario(String user) throws SQLException {

        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        Usuario u = new Usuario();
        try {
            String sql;
            sql = "select * from usuario where email ='" + user + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                u.setIdUsuario(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("Email"));
                u.setSenha(rs.getString("senha"));
                u.setCpf(rs.getString("cpf"));
            }
        } catch (SQLException e) {
            throw new SQLException("Usuario não encontrado.\n" + e.getMessage());
        } finally {
            con.close();
            stmt.close();
        }
        return u;
    }

    // atualizar 
    public void atualizarUsuaio(Usuario uVO) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "update usuario set "
                    + "nome = '" + uVO.getNome() + "',"
                    + "telefone = '" + uVO.getTelefone() + "',"
                    + "email = '" + uVO.getEmail() + "',"
                    + "cpf = '" + uVO.getCpf() + "',"
                    + "cep = '" + uVO.getCep() + "',"
                    + "endereco = '" + uVO.getEndereco() + "',"
                    + "senha = '" + uVO.getSenha() + "',"
                    + "status = " + uVO.isStatus() + "";
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar usuário!" + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    // deletar
    public void deletarUsuario(int id) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        Usuario u = new Usuario();
        try {
            String sql;
            sql = "delete from usuario where id = " + id;
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar usuário!" + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
    // 

    public boolean verEmail(String email) throws SQLException { //EU CRIEI ESTE METODO PARA USAR NO VALIDA INPUTS
        Connection con = Conexao.getConnection();                      //PARA O USUARIO NAO SE CADASTRAR COM 2 EMAILS IGUAIS 
        Statement stmt = con.createStatement();
        boolean verEmail = false;

        try {
            String sql;
            sql = "select email from usuario where email = '" + email +"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                verEmail = rs.wasNull();
            }
        } catch (SQLException e) {
            throw new SQLException("Usuario com este Email não existe. \n"
                    + e.getMessage());
        } finally {
            con.close();
            stmt.close();
        }

        return verEmail;
    }

    public boolean verCPF(String cpf) throws SQLException { //EU CRIEI ESTE METODO PARA USAR NO VALIDA INPUTS
        Connection con = Conexao.getConnection();                      //PARA O USUARIO NAO SE CADASTRAR COM 2 CPF IGUAIS 
        Statement stmt = con.createStatement();

        boolean vercpf = false;

        try {
            String sql;
            sql = "select cpf from usuario where cpf ' " + cpf + " ' ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                vercpf = rs.wasNull();
            }
        } catch (SQLException e) {
            throw new SQLException("Usuario com este CPF não existe. \n"
                    + e.getMessage());
        } finally {
            con.close();
            stmt.close();
        }

        return vercpf;
    }

}
