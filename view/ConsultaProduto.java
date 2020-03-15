/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import helper.ControleDeArquivo;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Produto;

/**
 *
 * @author tawany
 */
public class ConsultaProduto extends javax.swing.JFrame {
    private static final String ARQUIVO_PRODUTO = "file.txt";

    /**
     * Creates new form ConsultaProduto
     */
    public ConsultaProduto() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jInternalFrameConsultarProduto = new javax.swing.JInternalFrame();
        jLabelConsultaNome = new javax.swing.JLabel();
        jTextFieldConsultaNome = new javax.swing.JTextField();
        jButtonConsultarProduto = new javax.swing.JButton();
        jLabelConsultaCodigo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelConsultaQtd = new javax.swing.JLabel();
        jLabelConsultaPreco = new javax.swing.JLabel();
        jTextFieldConsultaCodigo = new javax.swing.JTextField();
        jTextFieldConsultaQtd = new javax.swing.JTextField();
        jTextFieldConsultaPreco = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameConsultarProduto.setResizable(true);
        jInternalFrameConsultarProduto.setTitle("Consultar Produto");
        jInternalFrameConsultarProduto.setVisible(true);

        jLabelConsultaNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelConsultaNome.setText("Nome do produto a ser consultado: ");

        jTextFieldConsultaNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldConsultaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaNomeActionPerformed(evt);
            }
        });

        jButtonConsultarProduto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonConsultarProduto.setText("Consultar");
        jButtonConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarProdutoActionPerformed(evt);
            }
        });

        jLabelConsultaCodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelConsultaCodigo.setText("Código:");

        jLabelConsultaQtd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelConsultaQtd.setText("Quantidade:");

        jLabelConsultaPreco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelConsultaPreco.setText("Preço:");

        jTextFieldConsultaCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldConsultaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaCodigoActionPerformed(evt);
            }
        });

        jTextFieldConsultaQtd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldConsultaQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaQtdActionPerformed(evt);
            }
        });

        jTextFieldConsultaPreco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldConsultaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaPrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultarProdutoLayout = new javax.swing.GroupLayout(jInternalFrameConsultarProduto.getContentPane());
        jInternalFrameConsultarProduto.getContentPane().setLayout(jInternalFrameConsultarProdutoLayout);
        jInternalFrameConsultarProdutoLayout.setHorizontalGroup(
            jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jInternalFrameConsultarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameConsultarProdutoLayout.createSequentialGroup()
                        .addComponent(jLabelConsultaCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldConsultaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrameConsultarProdutoLayout.createSequentialGroup()
                        .addComponent(jLabelConsultaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButtonConsultarProduto)
                        .addGap(26, 26, 26))
                    .addGroup(jInternalFrameConsultarProdutoLayout.createSequentialGroup()
                        .addGroup(jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameConsultarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabelConsultaQtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldConsultaQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameConsultarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabelConsultaPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldConsultaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jInternalFrameConsultarProdutoLayout.setVerticalGroup(
            jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameConsultarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaCodigo)
                    .addComponent(jTextFieldConsultaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaQtd)
                    .addComponent(jTextFieldConsultaQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaPreco)
                    .addComponent(jTextFieldConsultaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabelConsultaNome.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameConsultarProduto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameConsultarProduto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldConsultaQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaQtdActionPerformed

    private void jTextFieldConsultaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaPrecoActionPerformed

    private void jTextFieldConsultaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaNomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldConsultaNomeActionPerformed

    private void jButtonConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarProdutoActionPerformed
    
        ArrayList<Object> objects;
        ArrayList<Produto> produtos = new ArrayList<>();
        
        
        objects = new ControleDeArquivo(new File(ARQUIVO_PRODUTO)).ler();
        
        objects.forEach((o) -> {
            produtos.add((Produto) o);
        });
        
        System.out.println(produtos.get(0).getNome());        
        // TODO add your handling code here:
        if (!(jTextFieldConsultaNome.getText().equalsIgnoreCase(""))) {
            for (Produto p : produtos){
                if (p.getNome().equalsIgnoreCase(jTextFieldConsultaNome.getText())){
                    pp = p;
                    verifica = true;
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                }
            }
            
            if (verifica == true){
                jTextFieldConsultaNome.setText(pp.getNome());
                jTextFieldConsultaCodigo.setText(Integer.toString(pp.getCodigo()));
                jTextFieldConsultaQtd.setText(Integer.toString(pp.getQuantidade()));
                jTextFieldConsultaPreco.setText(Double.toString(pp.getPreco()));
            }
                    
           
        }
    }//GEN-LAST:event_jButtonConsultarProdutoActionPerformed

    private void jTextFieldConsultaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarProduto;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrameConsultarProduto;
    private javax.swing.JLabel jLabelConsultaCodigo;
    private javax.swing.JLabel jLabelConsultaNome;
    private javax.swing.JLabel jLabelConsultaPreco;
    private javax.swing.JLabel jLabelConsultaQtd;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldConsultaCodigo;
    private javax.swing.JTextField jTextFieldConsultaNome;
    private javax.swing.JTextField jTextFieldConsultaPreco;
    private javax.swing.JTextField jTextFieldConsultaQtd;
    // End of variables declaration//GEN-END:variables
    
    private boolean verifica = false;
    private Produto pp;

}
