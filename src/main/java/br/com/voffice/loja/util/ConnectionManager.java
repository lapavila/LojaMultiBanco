package br.com.voffice.loja.util;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.com.voffice.loja.exception.GlobalcodeException;

public class ConnectionManager {

    public static Connection getConnection() throws GlobalcodeException {

        Properties props = PropertiesUtil.getProperties();

        String strCon = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String pass = props.getProperty("db.pass");
        String banco = props.getProperty("db.banco");

        Connection conn = null;
        try {
            System.out.println("[ConnectionManager]: Obtendo conexao com o " + banco);
            conn = DriverManager.getConnection(strCon, user, pass);
            System.out.println("[ConnectionManager]: Conectado com o " + banco);
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro ao obter a conexao", e);
        }
        return conn;
    }

    public static void closeAll(Connection conn) {
        try {
            // b)Se a conexao (conn) nao eh null, entao feche a conexao
            if (conn != null && !conn.isClosed()) {
                System.out.println("[ConnectionManager]: Fechando conexao");
                conn.close();
                System.out.println("[ConnectionManager]: Conexao Fechada Fechada");
            }

        } catch (Exception e) {
            System.out.println("---> Nao foi possivel fechar a conexao com o banco");
            System.out.println("---> Detalhamento do erro: ");
            e.printStackTrace();
        }
    }
}
