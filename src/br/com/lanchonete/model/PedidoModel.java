/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.model;

/**
 *
 * @author aluno
 */
public class PedidoModel {

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLanche() {
        return lanche;
    }

    public void setLanche(int lanche) {
        this.lanche = lanche;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }
    public double getPrecoLanche() {
        return precoLanche;
    }

    public void setPrecoLanche(double precoLanche) {
        this.precoLanche = precoLanche;
    }

    public double getPrecoBebida() {
        return precoBebida;
    }

    public void setPrecoBebida(double precoBebida) {
        this.precoBebida = precoBebida;
    }

    private String cpf;
    private String nome;
    private int  lanche;
    private int bebida; 

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }
    private String nomeBebida;
    private String nomeLanche;
    private double precoLanche;
    private double precoBebida;


    
}
