/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.dao;

import br.com.lanchonete.model.LancheModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author ftana
 */
public class LancheDAO {
     Connection conn;
     PreparedStatement pstm;
     ResultSet resultst;
     ArrayList<LancheModel> lanches = new ArrayList(){};
     
       public void CadastrarLanche(LancheModel lanche) {
         String sql = "insert into Lanches(nome, descricao, preco) values(?,?,?)";
         conn = new DAO().conecta();
      try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, lanche.getNome());
            pstm.setString(2, lanche.getDesc());
            pstm.setDouble(3, lanche.getPreco());
    
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "LancheDao: " + erro);
        }
      
     }
       
       public ArrayList<LancheModel> MostrarLanches() {
        String sql = "select * from Lanches";
        conn = new DAO().conecta();
        try {
            pstm = conn.prepareStatement(sql);
            resultst = pstm.executeQuery();

            while (resultst.next()) {
                
                LancheModel lanche = new LancheModel();
                lanche.setId(resultst.getInt("id"));
                lanche.setNome(resultst.getString("nome"));
                lanche.setDesc(resultst.getString("descricao"));
                lanche.setPreco(resultst.getDouble("preco"));
                lanches.add(lanche);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os lanches " + e);
        }
        return lanches;
    }
}
