/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Produtos;

import Model.Produtos;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Paulo.Bezerra
 */
public class Alterar {

    private Connection conexao = null;

    Produtos produtos = new Produtos();

    public Produtos PesquisarProduto(long codigobarras) {

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexao = DAO.BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            select = "select * from produto where id = " + codigobarras;
            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                produtos.setCodigobarras(result.getInt("id"));
                produtos.setNomeProduto(result.getString("nome"));
                produtos.setDescricao(result.getString("descricao"));
                produtos.setPrecoCompra(result.getDouble("preco_compra"));
                produtos.setPrecoVenda(result.getDouble("preco_venda"));
                produtos.setDatacadastro(result.getDate("dt_cadastro"));
                produtos.setQuantidade(result.getInt("quantidade"));

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        if (produtos.getNomeProduto() == null) {
            //JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }

        return produtos;
    }

    public void AtualizarProduto(Produtos produtos) {


        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexao = DAO.BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            st.executeUpdate("update produtos set nome = '"+produtos.getNomeProduto()+"', descricao = '"+produtos.getDescricao()
                    +"', preco_compra = "+produtos.getPrecoCompra()+", preco_venda = "+produtos.getPrecoVenda()+
                    ", quantidade = "+produtos.getQuantidade()+", dt_cadastro = NOW() where id = "+produtos.getCodigobarras()+";");

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        if (produtos.getNomeProduto() == null) {
            //JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }

    }

}
