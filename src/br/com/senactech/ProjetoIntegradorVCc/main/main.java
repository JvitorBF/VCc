
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.main;

import br.com.senactech.ProjetoIntegradorVCc.view.login;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class main extends JFrame {

    private static void createAndShowGUI() {
        login l = new login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
