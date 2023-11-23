/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.dao;

import br.com.lanchonete.model.ClienteModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ftana
 */
public class ClienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet resultst;
    ArrayList<ClienteModel> clientes = new ArrayList<>();

    public void cadastrarCliente(ClienteModel cliente) {
        String sql = "insert into Clientes(cpf, nome, idade, telefone) values(?,?,?,?)";

        conn = new DAO().conecta();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            pstm.setInt(3, cliente.getIdade());
            pstm.setString(4, cliente.getTelefone());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ClienteDAO: " + erro);
        }
    }

    public ArrayList<ClienteModel> MostrarClientes() {
        String sql = "select * from clientes";
        conn = new DAO().conecta();
        try {
            pstm = conn.prepareStatement(sql);
            resultst = pstm.executeQuery();

            while (resultst.next()) {
                ClienteModel cliente = new ClienteModel();
                cliente.setCpf(resultst.getString("cpf"));
                cliente.setNome(resultst.getString("nome"));
                cliente.setIdade(resultst.getInt("idade"));
                cliente.setTelefone(resultst.getString("telefone"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os clientes " + e);
        }
        return clientes;
    }
}
