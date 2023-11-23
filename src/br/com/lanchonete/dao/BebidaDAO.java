/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.dao;

import br.com.lanchonete.model.BebidaModel;
import br.com.lanchonete.model.LancheModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ftana
 */
public class BebidaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet resultst;
    ArrayList<BebidaModel> bebidas = new ArrayList() {
    };

    public void CadastrarBebida(BebidaModel bebida) {
        String sql = "insert into Bebidas(nome, preco) values(?,?)";
        conn = new DAO().conecta();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, bebida.getNome());
            pstm.setDouble(2, bebida.getPreco());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BebidaDAO: " + erro);
        }

    }

    public ArrayList<BebidaModel> MostrarBebidas() {
        String sql = "select * from Bebidas";
        conn = new DAO().conecta();
        try {
            pstm = conn.prepareStatement(sql);
            resultst = pstm.executeQuery();

            while (resultst.next()) {

                BebidaModel bebida = new BebidaModel();
                bebida.setId(resultst.getInt("id"));
                bebida.setNome(resultst.getString("nome"));
                bebida.setPreco(resultst.getDouble("preco"));
                bebidas.add(bebida);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as bebidas " + e);
        }
        return bebidas;
    }

}
