/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Cliente;
import models.Produto;

/**
 *
 * @author tawany
 */
public class MainClass extends javax.swing.JFrame {
    ArrayList<Produto> produtos;
    /**
     * Creates new form MainClass
     */
    public MainClass() {
        initComponents();
    }
    
    public static void setPosicao(int posicao) {
        MainClass.posicao = posicao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAlterar = new javax.swing.JButton();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonConsultarProduto = new javax.swing.JButton();
        jButtonIniciarCompra = new javax.swing.JButton();
        jLabelSupermercado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonAlterar.setText("Alterar Produto");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonCadastrarProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCadastrarProduto.setText("Cadastrar Produto");
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });

        jButtonConsultarProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonConsultarProduto.setText("Consultar Produto");
        jButtonConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarProdutoActionPerformed(evt);
            }
        });

        jButtonIniciarCompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonIniciarCompra.setText("Iniciar Compra");
        jButtonIniciarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarCompraActionPerformed(evt);
            }
        });

        jLabelSupermercado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelSupermercado.setText("Supermercado CI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButtonAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConsultarProduto)
                            .addComponent(jButtonCadastrarProduto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButtonIniciarCompra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabelSupermercado)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelSupermercado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonAlterar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrarProduto)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultarProduto)
                .addGap(18, 18, 18)
                .addComponent(jButtonIniciarCompra)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        AlteraProduto telaAlt = new AlteraProduto();
        telaAlt.setVisible(true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        CadastroProduto telaCad = new CadastroProduto();
        telaCad.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed

    private void jButtonConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarProdutoActionPerformed
        ConsultaProduto telaCon = new ConsultaProduto();
        telaCon.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarProdutoActionPerformed

    private void jButtonIniciarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarCompraActionPerformed
        TelaVenda telaVen = new TelaVenda();
        telaVen.setVisible(true);
    }//GEN-LAST:event_jButtonIniciarCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<Cliente> clientes;
        
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
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//        try {
//            clientes = new PersistenciaCliente(new File("data/clientes.sav")).ler();
//        } catch (IOException ex) {
//            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {             
                new MainClass().setVisible(true);
            }
            
        });
    }
    
    private static int posicao;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonConsultarProduto;
    private javax.swing.JButton jButtonIniciarCompra;
    private javax.swing.JLabel jLabelSupermercado;
    // End of variables declaration//GEN-END:variables
}
