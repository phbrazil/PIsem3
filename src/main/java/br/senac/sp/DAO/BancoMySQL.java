


package br.senac.sp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;




public class BancoMySQL {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {

            String url = "jdbc:mysql://localhost:3306/PRODUTOBD";

            Properties dados = new Properties();
            dados.put("user", "root");
            dados.put("password", "admin");

            connection = DriverManager.getConnection(url, dados);
        }

        return connection;
    }

}
