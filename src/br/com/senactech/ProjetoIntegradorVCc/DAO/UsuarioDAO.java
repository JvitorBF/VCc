/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.DAO;

import br.com.senactech.ProjetoIntegradorVCc.conexao.Conexao;
import br.com.senactech.projetoIntegradorVCc.model.Usuario;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

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
            sql = "insert into usuario values (null'"
                    + uVO.getNome() + "','" + uVO.getTelefone() + "','"
                    + uVO.getEmail() + "','" + uVO.getCpf() + "','"
                    + uVO.getCep() + "','" + uVO.getEndereco() + "','"
                    + uVO.getSenha() + "'," + uVO.isStatus() + ")";
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar usuário!" + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
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
}
