/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.voffice.loja.teste;

import java.sql.Connection;

import br.com.voffice.loja.dao.DataAccessObject;
import br.com.voffice.loja.dao.ProdutoDaoFactory;
import br.com.voffice.loja.exception.GlobalcodeException;
import br.com.voffice.loja.model.Produto;
import br.com.voffice.loja.util.ConnectionManager;

public class TesteConexao {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = ConnectionManager.getConnection();
            DataAccessObject<Produto> pDao = ProdutoDaoFactory.createDao();
            pDao.insere(null);
        } catch (GlobalcodeException ge) {
            System.out.println("---> " + ge.getMessage());
            System.out.println("---> Detalhamento do erro: ");
            ge.printStackTrace();
        } finally {
            ConnectionManager.closeAll(conn);
        }
    }

}
