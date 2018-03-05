/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Produtos;

import DAO.BancoMySQL;
import Model.Produtos;
import java.sql.Connection;

/**
 *
 * @author paulo.hbezerra
 */
public class NovoProduto {

    private Connection conexao = null;

    public void InsertNovoProduto(Produtos produtos) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO produtos (codigobarras, nomeproduto,valor,valordesconto, faixaetaria,fabricante,prazogarantia, quantidade,DataCadastro, statusproduto)"
                    + " VALUES (" + produtos.getCodigobarras()+ ",'" + produtos.getNomeProduto() + "'," + produtos.getValor() + "," + produtos.getValorDesconto()+ ",'" + produtos.getFaixaEtaria() + "','" + produtos.getFabricante()+"','"+produtos.getGarantia()+"',"+produtos.getQuantidade()+",NOW(),true);");
            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
    }

}
