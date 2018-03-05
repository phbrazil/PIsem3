/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author killuminatti08
 */
public class Vendas {

    private int vendaid;
    private String CPFCliente;
    private double totalvalor;
    private String datavenda;
    private int quantidadeitens;

    public int getVenda() {
        return vendaid;

    }

    public void setVenda(int vendaid) {
        this.vendaid = vendaid;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public double getTotalValor() {
        return totalvalor;
    }

    public void setTotalValor(double totalvalor) {
        this.totalvalor = this.totalvalor+ totalvalor;

    }

    public String getDataVenda() {
        return datavenda;
    }

    public void setDataVenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public int getQuantidadeItens() {
        return quantidadeitens;

    }

    public void setQuantidadeItens(int quantidadeitens) {
        this.quantidadeitens = this.quantidadeitens+ quantidadeitens;
    }
}
