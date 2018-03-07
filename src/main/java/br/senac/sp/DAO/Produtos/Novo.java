



package br.senac.sp.DAO.Produtos;

import br.senac.sp.DAO.BancoMySQL;
import br.senac.sp.Model.Produtos;
import java.sql.Connection;





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
