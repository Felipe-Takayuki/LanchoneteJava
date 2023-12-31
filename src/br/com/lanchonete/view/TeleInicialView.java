/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lanchonete.view;

/**
 *
 * @author ftana
 */
public class TeleInicialView extends javax.swing.JFrame {

    /**
     * Creates new form TeleInicialView
     */
    public TeleInicialView() {
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

        btnNovoCliente = new javax.swing.JButton();
        BtnNovoLanche = new javax.swing.JButton();
        BtnNovaBebida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovoCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnNovoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setText("Clientes");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        BtnNovoLanche.setBackground(new java.awt.Color(153, 153, 153));
        BtnNovoLanche.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnNovoLanche.setForeground(new java.awt.Color(255, 255, 255));
        BtnNovoLanche.setText("Lanches");
        BtnNovoLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoLancheActionPerformed(evt);
            }
        });

        BtnNovaBebida.setBackground(new java.awt.Color(153, 153, 153));
        BtnNovaBebida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnNovaBebida.setForeground(new java.awt.Color(255, 255, 255));
        BtnNovaBebida.setText("Bebidas");
        BtnNovaBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovaBebidaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("LancheJava");

        BtnPedidos.setBackground(new java.awt.Color(153, 153, 153));
        BtnPedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        BtnPedidos.setText("Pedidos");
        BtnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnNovaBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnNovoLanche, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnNovoLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(BtnNovaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        this.dispose();
        CadastroClienteView ccv = new CadastroClienteView();
       ccv.setVisible(true);    
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void BtnNovoLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoLancheActionPerformed
        this.dispose();
       CadastroLancheView clv = new CadastroLancheView();
       clv.setVisible(true);    
    }//GEN-LAST:event_BtnNovoLancheActionPerformed

    private void BtnNovaBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovaBebidaActionPerformed
       this.dispose();
       CadastrarBebidaView cbv = new CadastrarBebidaView();
       cbv.setVisible(true);    
    }//GEN-LAST:event_BtnNovaBebidaActionPerformed

    private void BtnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPedidosActionPerformed
        this.dispose();
        CadastroPedidosView cpv = new CadastroPedidosView();
        cpv.setVisible(true);
    }//GEN-LAST:event_BtnPedidosActionPerformed

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
            java.util.logging.Logger.getLogger(TeleInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeleInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeleInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeleInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeleInicialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNovaBebida;
    private javax.swing.JButton BtnNovoLanche;
    private javax.swing.JButton BtnPedidos;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
