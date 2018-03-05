/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.Model;

import java.sql.Date;

/**
 *
 * @author killuminatti08
 */
public class Produtos {

    private int codigobarras;
    private String nomeproduto;
    private String descricao;
    private double precocompra;
    private double precovenda;
    private int Quantidade;
    private int idproduto;
    private Date datacadastro;

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Integer getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(Integer codigobarras) {
        this.codigobarras = codigobarras;
    }

    public String getNomeProduto() {
        return nomeproduto;
    }

    public void setNomeProduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public double getPrecoVenda() {
        return precovenda;
    }

    public void setPrecoVenda(double precovenda) {
        this.precovenda = precovenda;
    }

    public double getPrecoCompra() {
        return precocompra;
    }

    public void setPrecoCompra(double precocompra) {

        this.precocompra = precocompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public Integer getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.Quantidade = quantidade;
    }

    public Integer getIdProduto() {
        return idproduto;
    }

    public void setIdProduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

}
