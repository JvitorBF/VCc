/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.view;

import br.com.senactech.ProjetoIntegradorVCc.services.ServicosFactory;
import br.com.senactech.ProjetoIntegradorVCc.services.UsuarioServicos;
import br.com.senactech.ProjetoIntegradorVCc.model.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author João Vitor
 */
public class Registro extends javax.swing.JFrame {

    JButton btnClick = null;

    /**
     * Creates new form vccApp
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jbRegistrar = new javax.swing.JButton();
        jtfSenha = new javax.swing.JPasswordField();
        jlEmail = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();
        jlEmail2 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JFormattedTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jlEmail3 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlEmail4 = new javax.swing.JLabel();
        jtfCpf = new javax.swing.JFormattedTextField();
        jlEmail5 = new javax.swing.JLabel();
        jlSenha1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de LogIn");
        setMinimumSize(new java.awt.Dimension(400, 410));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 410));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("Tela de LogIn"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(120, 116, 109));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entre com os seus dados ");

        jtfEmail.setBackground(new java.awt.Color(255, 255, 255));
        jtfEmail.setForeground(new java.awt.Color(120, 116, 109));
        jtfEmail.setToolTipText("YYY@GMAIL.COM");
        jtfEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfEmail.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jtfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEmailKeyTyped(evt);
            }
        });

        jbRegistrar.setBackground(new java.awt.Color(28, 135, 68));
        jbRegistrar.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.setBorderPainted(false);
        jbRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegistrar.setFocusPainted(false);
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jtfSenha.setBackground(new java.awt.Color(255, 255, 255));
        jtfSenha.setForeground(new java.awt.Color(120, 116, 109));
        jtfSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfSenha.setMargin(new java.awt.Insets(0, 5, 0, 0));

        jlEmail.setForeground(new java.awt.Color(120, 116, 109));
        jlEmail.setText("Email");

        jlSenha.setForeground(new java.awt.Color(120, 116, 109));
        jlSenha.setText("Endereço");

        jtfCep.setBackground(new java.awt.Color(255, 255, 255));
        jtfCep.setForeground(new java.awt.Color(120, 116, 109));
        jtfCep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfCep.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfCep.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jtfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCepKeyTyped(evt);
            }
        });

        jlEmail2.setForeground(new java.awt.Color(120, 116, 109));
        jlEmail2.setText("Nome");

        jtfEndereco.setBackground(new java.awt.Color(255, 255, 255));

        jtfTelefone.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlEmail3.setForeground(new java.awt.Color(120, 116, 109));
        jlEmail3.setText("Cpf");

        jtfNome.setBackground(new java.awt.Color(255, 255, 255));
        jtfNome.setForeground(new java.awt.Color(120, 116, 109));
        jtfNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNome.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomeKeyTyped(evt);
            }
        });

        jlEmail4.setForeground(new java.awt.Color(120, 116, 109));
        jlEmail4.setText("Telefone");

        jtfCpf.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlEmail5.setForeground(new java.awt.Color(120, 116, 109));
        jlEmail5.setText("Cep");

        jlSenha1.setForeground(new java.awt.Color(120, 116, 109));
        jlSenha1.setText("Senha");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(120, 116, 109));
        jButton1.setText("Login");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlEmail2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlSenha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jlEmail5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(jlEmail4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfCep, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfTelefone, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        if (validaInputs()) {
            try {
                String senha = geraSenha(String.valueOf(jtfSenha.getPassword()));

                UsuarioServicos uServicos = ServicosFactory.getUsuarioServicos();
                Usuario u = new Usuario();
                u.setNome(jtfNome.getText().toUpperCase());
                u.setEmail(jtfEmail.getText());
                u.setSenha(senha);
                u.setEndereco(jtfEndereco.getText());
                u.setTelefone(jtfTelefone.getText());
                u.setCep(jtfCep.getText());
                u.setCpf(jtfCpf.getText());
                try {
                    uServicos.cadUsuario(u);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(rootPane, "Usuário cadastro com sucesso.",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

//    ESTE METODO SERVE PARA GERAR UMA SENHA CRIPTADA
    public static String geraSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        {
            MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
            byte mdByteMD5[] = mdMD5.digest(senha.getBytes("UTF-8"));
            StringBuilder hexMDMD5 = new StringBuilder();
            for (byte b : mdByteMD5) {
                hexMDMD5.append(String.format("%02X", 0xFF & b));
            }
            String senhaMD5HashHex = hexMDMD5.toString();
            return senhaMD5HashHex;
        }

    } // FIM METODO INCRIPITAR SENHA

    public Boolean validaInputs() {
        //String email = jtfEmail.getText();
        String telefone = jtfTelefone.getText();
        UsuarioServicos usuarioS = ServicosFactory.getUsuarioServicos();
        //VALIDA PARA QUE OS INPUTS NAO FIQUEM EM BRANCO
        if (jtfNome.getText().isBlank()
                || jtfEmail.getText().isBlank()
                // || String.valueOf(jtfSenha.getPassword().
                || jtfEndereco.getText().isBlank()
                || jtfTelefone.getText().isBlank()
                || jtfCep.getText().isBlank()
                || jtfCpf.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,
                    "Todos os campos devem ser preenchidos!",
                    ".: Erro :.", JOptionPane.ERROR_MESSAGE);
            jtfNome.requestFocus();
            return false;
        }

        //valida tamanho do numero de telefone
        if (telefone.length() < 14) { //&& telefone.length() != 11) {
            JOptionPane.showMessageDialog(this,
                    "Telefone informado esta incorreto",
                    ".: Erro :.", JOptionPane.ERROR_MESSAGE);
            jtfTelefone.requestFocus();
            return false;
        }

//        if (btnClick.getText() == "Registrar") {
//
//            try {
//                if (usuarioS.verEmail(jtfEmail.getText())) {
//                    JOptionPane.showMessageDialog(this,
//                            "Email já cadastrado, registre-se com outro email Por Favor!!!",
//                            ".: Erro :.", JOptionPane.ERROR_MESSAGE);
//                    jtfEmail.requestFocus();
//                    return false;
//                } else try {
//
//                    //validação para nao ter 2 emails iguais cadastrados
//                    if (usuarioS.verCPF(jtfCpf.getText())) {
//                        JOptionPane.showMessageDialog(this,
//                                "CPF já cadastrado!!!",
//                                ".: Erro :.", JOptionPane.ERROR_MESSAGE);
//                        jtfCpf.requestFocus();
//                        return false;
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
        return true;
    }

    private void jtfCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCepKeyTyped
        // VALIDA PARA O USUARIO NAO COLOCAR CARACTERES ESPECIAIS NEM NUMEROS
        String caracteres = "-0987654321";
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        } else if (!caracteres.contains(evt.getKeyChar() + "")) {
            JOptionPane.showMessageDialog(rootPane, "Utilize apenas numeros");
            evt.consume();
        }
    }//GEN-LAST:event_jtfCepKeyTyped

    private void jtfEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailKeyTyped

    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
        // VALIDA PARA O USUARIO NAO COLOCAR CARACTERES EPESCIAIS OU NUMEROS 
        String caracteres = "0987654321/[]{}=+-_)(*&¨%$#@!<>;:?";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            JOptionPane.showMessageDialog(rootPane, "Utilize apenas letras");
            evt.consume();
        }

    }//GEN-LAST:event_jtfNomeKeyTyped

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login l = new login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEmail2;
    private javax.swing.JLabel jlEmail3;
    private javax.swing.JLabel jlEmail4;
    private javax.swing.JLabel jlEmail5;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlSenha1;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JFormattedTextField jtfCpf;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JFormattedTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JFormattedTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
