package br.com.voffice.loja.dao;

import java.util.Properties;

import br.com.voffice.loja.dao.mysql.ProdutoDaoMysql;
import br.com.voffice.loja.dao.postgres.ProdutoDaoPostgres;
import br.com.voffice.loja.util.PropertiesUtil;

public class ProdutoDaoFactory {

    public static <E> DataAccessObject<E> createDao() {
        Properties props = PropertiesUtil.getProperties();
        String banco = props.getProperty("db.banco");
        switch (banco) {
            case "mysql":
                System.out.println("[ProdutoDaoFactory] Criando Produto DAO MySQL");
                return (DataAccessObject<E>) new ProdutoDaoMysql();
            case "postgres":
                System.out.println("[ProdutoDaoFactory] Criando Produto DAO Postgres");
                return (DataAccessObject<E>) new ProdutoDaoPostgres();
            default:
                return null;
        }
    }
}
