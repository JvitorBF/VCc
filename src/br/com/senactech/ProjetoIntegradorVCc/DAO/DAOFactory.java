/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.DAO;

/**
 *
 * @author João Vitor
 */
public class DAOFactory {

    private static final UsuarioDAO uDAO = new UsuarioDAO();

    public static UsuarioDAO getUsuarioDAO() {
        return uDAO;
    }

}
