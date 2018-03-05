/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author paulo.bezerra
 */
public class RelatorioVendas {



    private Connection conexao = null;

    private int idvenda = 0, quantidadeitens = 0, quantidadevendas = 0;
    private String cpfcliente = "", datavenda = "";
    private double valor = 0;

    public void SelectVendas(int idvenda) {

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();

            select = "select * from vendas where idvenda = " + idvenda;

            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                this.idvenda = result.getInt("idvenda");
                cpfcliente = result.getString("cpfcliente");
                valor = result.getDouble("totalvalor");
                datavenda = result.getString("datavenda");
                quantidadeitens = result.getInt("quantidadeitens");

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
    }

    public int SelectQuantidadeVendas() {

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();

            select = "select count(*) as quantidadevendas from vendas";

            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                quantidadevendas = result.getInt("quantidadevendas");

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        return quantidadevendas;
    }

    public int GetIDVenda() {
        return idvenda;
    }

    public String GetCPFCliente() {
        return cpfcliente;

    }

    public double GetValorVenda() {
        return valor;
    }

    public int GetQuantidadeItens() {
        return quantidadeitens;
    }

    public String GetDataVenda() {

        return datavenda;

    }
}
