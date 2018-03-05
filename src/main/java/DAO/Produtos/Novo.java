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
public class Novo {

    private Connection conexao = null;

    public void InsertNovoProduto(Produtos produtos) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO PRODUTO (NOME, DESCRICAO,PRECO_COMPRA,PRECO_VENDA, QUANTIDADE,DT_CADASTRO)"
                    + " VALUES ('" + produtos.getNomeProduto() + "','" + produtos.getDescricao()
                    + "'," + produtos.getPrecoCompra() + "," + produtos.getPrecoVenda() + ","
                    + produtos.getQuantidade() + ",NOW());");
            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
    }

}
