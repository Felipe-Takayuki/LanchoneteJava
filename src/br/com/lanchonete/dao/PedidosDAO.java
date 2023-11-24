/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.dao;

import br.com.lanchonete.model.LancheModel;
import br.com.lanchonete.model.PedidoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class PedidosDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet resultst;
    ArrayList<PedidoModel> pedidos = new ArrayList() {};

    public void CadastrarPedido(PedidoModel pedidoModel) {
        String sql = "insert into Pedidos(lancheID, bebidaID, clienteID) values (?,?,?)";
        conn = new DAO().conecta();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, pedidoModel.getLanche());
            pstm.setInt(2, pedidoModel.getBebida());
            pstm.setString(3, pedidoModel.getCpf());
            
            pstm.execute();
            pstm.close();
             JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Pedidos ERROR:" + erro);
        }
    }
    
    public ArrayList<PedidoModel> MostrarPedidos() {
        String sql = " SELECT clientes.cpf, clientes.nome,   bebidas.nome as bebida,lanches.nome as lanche,lanches.preco as precoLanche, bebidas.preco as precoBebida FROM clientes JOIN pedidos ON clientes.cpf = pedidos.clienteID JOIN lanches ON pedidos.lancheID = lanches.id JOIN bebidas ON pedidos.bebidaID = bebidas.id";
        conn = new DAO().conecta();
        try {
           pstm = conn.prepareStatement(sql);
           resultst = pstm.executeQuery();
              while (resultst.next()) {
                
                PedidoModel pedido = new PedidoModel();
                pedido.setCpf(resultst.getString("cpf"));
                pedido.setNome(resultst.getString("nome"));
                pedido.setNomeLanche(resultst.getString("lanche"));
                pedido.setNomeBebida(resultst.getString("bebida"));
                pedido.setPrecoBebida(resultst.getDouble("precoBebida"));
                pedido.setPrecoLanche(resultst.getDouble("precoLanche"));
                pedidos.add(pedido);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO ao mostrar os pedidos: "+erro );
        }
        return pedidos;
    }
}
