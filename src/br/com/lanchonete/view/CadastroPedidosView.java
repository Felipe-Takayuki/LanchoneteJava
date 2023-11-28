/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lanchonete.view;

import br.com.lanchonete.dao.PedidosDAO;
import br.com.lanchonete.model.PedidoCadastro;
import br.com.lanchonete.model.PedidoModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class CadastroPedidosView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPedidosView
     */
    public CadastroPedidosView() {
        initComponents();
        listarPedidos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtFieldCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnCadastrarPedido = new javax.swing.JButton();
        btnTelaPincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbPedidos = new javax.swing.JTable();
        TxtFieldBebidaName = new javax.swing.JTextField();
        TxtFieldHamburguerName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CPF CLIENTE");

        TxtFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldCPFActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do hamburguer");

        jLabel3.setText("Nome da Bebida");

        BtnCadastrarPedido.setText("Cadastrar Pedido");
        BtnCadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarPedidoActionPerformed(evt);
            }
        });

        btnTelaPincipal.setText("Tela Principal");
        btnTelaPincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaPincipalActionPerformed(evt);
            }
        });

        TbPedidos.setBackground(new java.awt.Color(153, 153, 153));
        TbPedidos.setForeground(new java.awt.Color(255, 255, 255));
        TbPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Lanche", "Bebida", "ValorTotal"
            }
        ));
        jScrollPane1.setViewportView(TbPedidos);

        TxtFieldHamburguerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldHamburguerNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtFieldCPF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(BtnCadastrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addComponent(btnTelaPincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(TxtFieldBebidaName)
                    .addComponent(TxtFieldHamburguerName))
                .addGap(181, 181, 181)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtFieldHamburguerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFieldBebidaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCadastrarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTelaPincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldCPFActionPerformed

    private void BtnCadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarPedidoActionPerformed
     cadastrarPedido();
     listarPedidos();
        
    }//GEN-LAST:event_BtnCadastrarPedidoActionPerformed

    private void btnTelaPincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaPincipalActionPerformed
        this.dispose();
        TeleInicialView tiv = new TeleInicialView();
        tiv.setVisible(true);

    }//GEN-LAST:event_btnTelaPincipalActionPerformed

    private void TxtFieldHamburguerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldHamburguerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldHamburguerNameActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPedidosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrarPedido;
    private javax.swing.JTable TbPedidos;
    private javax.swing.JTextField TxtFieldBebidaName;
    private javax.swing.JTextField TxtFieldCPF;
    private javax.swing.JTextField TxtFieldHamburguerName;
    private javax.swing.JButton btnTelaPincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void listarPedidos() {
        try {
            PedidosDAO pedidodao = new PedidosDAO();
            double precoTotal;
            DefaultTableModel model = (DefaultTableModel) TbPedidos.getModel();
            model.setNumRows(0);
            ArrayList<PedidoModel> pedidos = pedidodao.MostrarPedidos();
            for (int num = 0; num < pedidos.size(); num++) {
                model.addRow(new Object[]{
                    pedidos.get(num).getCpf(),
                    pedidos.get(num).getNome(),
                    pedidos.get(num).getNomeLanche(),
                    pedidos.get(num).getNomeBebida(),
                    precoTotal = pedidos.get(num).getPrecoBebida() + pedidos.get(num).getPrecoLanche()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro para listar os clientes: " + erro);
        }
    }
    
    private void cadastrarPedido(){
       String cpf, hamburguerNome, bebidaNome;
        cpf = TxtFieldCPF.getText();
        hamburguerNome = TxtFieldHamburguerName.getText();
        bebidaNome = TxtFieldBebidaName.getText();
        
        PedidoCadastro pdCadastro = new PedidoCadastro();
        pdCadastro.setCpf(cpf);
        pdCadastro.setNomeBebida(bebidaNome);
        pdCadastro.setNomeLanche(hamburguerNome);
        
        PedidosDAO pdDAO = new PedidosDAO();
        pdDAO.CadastrarPedido(pdCadastro);
    }
}
