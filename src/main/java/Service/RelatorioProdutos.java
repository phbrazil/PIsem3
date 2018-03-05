/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hbezerra
 */
public class RelatorioProdutos {

   
    private Connection conexao = null;

    private String nomeproduto = "", faixaetaria = "", fabricante = "", prazogarantia = "";
    private int quantidade = 0;
    private int codigobarras = 0;
    private double valor = 0, valordesconto = 0;

    private int quantidadeprodutos = 0;

    public void SelectProduto(int idproduto) {
        
        SelectQuantosProdutos();

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();

            for (int i = 1; i <= quantidadeprodutos; i++) {
                select = "select * from produtos where idproduto = " + idproduto;

                ResultSet result = st.executeQuery(select);

                while (result.next()) {

                    codigobarras = result.getInt("codigobarras");
                    nomeproduto = result.getString("nomeproduto");
                    valor = result.getInt("valor");
                    valordesconto = result.getInt("valordesconto");
                    faixaetaria = result.getString("faixaetaria");
                    fabricante = result.getString("fabricante");
                    prazogarantia = result.getString("prazogarantia");
                    quantidade = result.getInt("quantidade");

                }
            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        

    }

    public int SelectQuantosProdutos() {

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            select = "select count(*) as quantidadeprodutos from produtos";
            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                quantidadeprodutos = result.getInt("quantidadeprodutos");

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        return quantidadeprodutos;

    }

    public long GetcodigoBarras() {

        return codigobarras;
    }

    public String GetNomeProduto() {

        return nomeproduto;
    }

    public double GetValor() {

        return valor;
    }

    public double GetValorDesconto() {

        return valordesconto;
    }

    public String GetFaixaEtaria() {

        return faixaetaria;
    }

    public String GetFabricante() {

        return fabricante;
    }

    public String GetPrazoGarantia() {

        return prazogarantia;
    }

    public int Getquantidade() {

        return quantidade;
    }
}
