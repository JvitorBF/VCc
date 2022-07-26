/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.services;

import br.com.senactech.ProjetoIntegradorVCc.DAO.UsuarioDAO;
import br.com.senactech.ProjetoIntegradorVCc.DAO.DAOFactory;
import br.com.senactech.ProjetoIntegradorVCc.model.Usuario;
import java.sql.SQLException;
/**
 *
 * @author João Vitor
 */
public class UsuarioServicos {
    
     private final UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
    
     public void cadUsuario(Usuario uVO) throws SQLException {
        uDAO.cadastrarUsuario(uVO);
    }
     
     public Usuario getByUsuario(String user) throws SQLException {
        return uDAO.getByUsuario(user);
    }
     
     public boolean verEmail(String email) throws SQLException {
        UsuarioDAO pDAO = DAOFactory.getUsuarioDAO();
        return pDAO.verEmail(email);
    }
     public boolean verCPF(String cpf) throws SQLException {
        UsuarioDAO pDAO = DAOFactory.getUsuarioDAO();
        return pDAO.verCPF(cpf);
    }
     
}
