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
public class RelatorioClientes {
    
    
    private Connection conexao = null;

    private String nomecliente = "", CPF = "", RG = "", telefone = "", celular = "", email = "", estadocivil = "";

    private int quantidadeclientes = 0;

    public void SelectCliente(int idcliente) {
        
        SelectQuantosClientes();

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();

            for (int i = 1; i <= quantidadeclientes; i++) {
                select = "select * from clientes where clienteid = " + idcliente;

                ResultSet result = st.executeQuery(select);

                while (result.next()) {

                    nomecliente = result.getString("nome");
                    CPF = result.getString("CPF");
                    RG = result.getString("RG");
                    telefone = result.getString("telefone");
                    celular = result.getString("celular");
                    email = result.getString("email");
                    estadocivil = result.getString("estadocivil");

                }
            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        

    }

    public int SelectQuantosClientes() {

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            select = "select count(*) as quantidadeclientes from clientes";
            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                quantidadeclientes = result.getInt("quantidadeclientes");

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        return quantidadeclientes;

    }

    public String GetNome() {

        return nomecliente;
    }

    public String GetRG() {

        return RG;
    }

    public String GetCPF() {

        return CPF;
    }

    public String GetTelefone() {

        return telefone;
    }

    public String GetCelular() {

        return celular;
    }

    public String GetEmail() {

        return email;
    }

    public String GetEstadoCivil() {

        return estadocivil;
    }
    
}
