/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.view;

import javax.swing.JOptionPane;

/**
 *
 * @author faria
 */
public class Eficacia extends javax.swing.JFrame {

    /**
     * Creates new form GruposPrioritarios
     */
    public Eficacia() {
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

        jPanel6 = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelParagrafo = new javax.swing.JLabel();
        botaoAjuda = new javax.swing.JButton();
        botaoLocaisVacinacao = new javax.swing.JButton();
        botaoInstrucoes = new javax.swing.JButton();
        botaoCalendario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eficácia");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        BotaoVoltar.setBackground(new java.awt.Color(38, 135, 68));
        BotaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.setFocusable(false);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        jSeparator6.setToolTipText("");

        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTitulo.setText("<html><u>Eficácia</u>");

        jLabelParagrafo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelParagrafo.setText("<html><p>Meses após o início da vacinação contra o coronavírus, a diferença que os imunizantes fazem na vida real"
            + "está ficando mais clara, cada vacina tem sua eficácia, como a vacina da Pfizer BioNTech contra a COVID-19"
            + "tem uma eficácia de 95% contra a infeção sintomática por SARS-CoV-2, já a vacina AstraZeneca contra a"
            + "COVID-19 tem uma eficácia de 63,09% contra a infeção sintomática pelo SARS-CoV-2."
            + "Intervalos mais longos entre as doses, com limites de 8 a 12 semanas, estão associados  a uma maior eficácia"
            + "da vacina. E a CoronaVac tem umas das menores taxas de eficácia, a eficácia geral da CoronaVac é 50,38%,"
            + "ou seja, os vacinados têm 50,38% menos risco de adoecer."
            + "Dados iniciais mostravam que, caso a pessoa seja infectada por covid-19, a vacina oferece 100% de eficácia"
            + "para não adoecer gravemente e 78% para prevenir casos leves."
            + "Isso são a eficácia de somente três vacinas, temos outras como Moderna, Sputnik V, e Janssen que todas tem"
            + "grande eficácia também. As vacinas são muito importantes, pois previne e salva muitas vidas, e desde que"
            + "a OMS declarou a pandemia do novo coronavírus, em março de 2020, laboratórios e pesquisadores se empenhara"
            + "para descobrir vacinas contra a covid-19 e atualmente temos muitas vacinas com grande eficácia ao covid-19,"
            + "por isso todos devemos tomar a vacina.  </p>"

        );

        botaoAjuda.setBackground(new java.awt.Color(255, 255, 255));
        botaoAjuda.setForeground(new java.awt.Color(102, 102, 102));
        botaoAjuda.setText("Ajuda");
        botaoAjuda.setBorder(null);
        botaoAjuda.setBorderPainted(false);
        botaoAjuda.setContentAreaFilled(false);
        botaoAjuda.setFocusPainted(false);
        botaoAjuda.setFocusable(false);
        botaoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAjudaActionPerformed(evt);
            }
        });

        botaoLocaisVacinacao.setForeground(new java.awt.Color(102, 102, 102));
        botaoLocaisVacinacao.setText("Locais de vacinação");
        botaoLocaisVacinacao.setBorder(null);
        botaoLocaisVacinacao.setBorderPainted(false);
        botaoLocaisVacinacao.setContentAreaFilled(false);
        botaoLocaisVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLocaisVacinacaoActionPerformed(evt);
            }
        });

        botaoInstrucoes.setForeground(new java.awt.Color(102, 102, 102));
        botaoInstrucoes.setText("Instruções");
        botaoInstrucoes.setBorder(null);
        botaoInstrucoes.setBorderPainted(false);
        botaoInstrucoes.setContentAreaFilled(false);
        botaoInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInstrucoesActionPerformed(evt);
            }
        });

        botaoCalendario.setForeground(new java.awt.Color(102, 102, 102));
        botaoCalendario.setText("Calendário");
        botaoCalendario.setBorderPainted(false);
        botaoCalendario.setContentAreaFilled(false);
        botaoCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalendarioActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("© 2021 WHO - Todos os direitos reservados");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoLocaisVacinacao)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoInstrucoes)
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelParagrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLocaisVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoInstrucoes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelParagrafo, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInstrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInstrucoesActionPerformed
        // TODO add your handling code here:
        Instrucoes ef = new Instrucoes();
        this.setVisible(false);
        ef.setVisible(true);
        ef.setLocationRelativeTo(null);
    }//GEN-LAST:event_botaoInstrucoesActionPerformed

    private void botaoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAjudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,
                "SE VOCÊ ESTA TENDO ALGUM PROBLEMA COM A APLICAÇÃO.\n"
                + " OU ESTA PRECISANDO DE AJUDA POR FAVOR ENTRE EM CONTATO NO E-MAIL ABAIXO PARA QUE POSSAMOS AJUDAR COM,\n"
                + " QUALQUER PROBLEMA OU BUG   || jvitorbf35@gmail.com || ");

    }//GEN-LAST:event_botaoAjudaActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        Instrucoes i = new Instrucoes();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void botaoCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalendarioActionPerformed
        // TODO add your handling code here:
        JCalendar cal = new JCalendar();
        this.setVisible(false);
        cal.setVisible(true);
        cal.setLocationRelativeTo(null);
    }//GEN-LAST:event_botaoCalendarioActionPerformed

    private void botaoLocaisVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLocaisVacinacaoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ,"Esta parte da aplicaçao nao foi finalizada sera uma implementação futura");
    }//GEN-LAST:event_botaoLocaisVacinacaoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eficacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eficacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eficacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eficacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Eficacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JButton botaoAjuda;
    private javax.swing.JButton botaoCalendario;
    private javax.swing.JButton botaoInstrucoes;
    private javax.swing.JButton botaoLocaisVacinacao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelParagrafo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
