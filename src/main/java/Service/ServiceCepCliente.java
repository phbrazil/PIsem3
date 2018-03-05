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
public class ServiceCepCliente {


    private String nomeproduto = "", faixaetaria = "", fabricante = "", prazogarantia = "", nomeCliente = "";

    private double valor = 0, valordesconto = 0;

    private Connection conexao = null;

    private String logradouro, cidade, UF, numero, estado;

    public void SelectCEP(String CEP) {

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

           // conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            select = "select * from CEPS where cep = '" + CEP + "'";
            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                logradouro = result.getString("logradouro");
                UF = result.getString("UF");
                numero = result.getString("numero");
                cidade = result.getString("cidade");
                estado = result.getString("estado");
            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        if (logradouro == null) {
            JOptionPane.showMessageDialog(null, "CEP não encontrado");

        }

    }

    public String GetLogradouro() {

        return logradouro;
    }

    public String GetCidade() {

        return cidade;
    }

    public String GetUF() {

        return UF;
    }

    public String GetEstado() {

        return estado;
    }

}
