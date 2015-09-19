package br.com.voffice.loja.dao.mysql;

import java.util.List;

import br.com.voffice.loja.dao.DataAccessObject;
import br.com.voffice.loja.model.Cliente;

public class ClienteDaoMysql implements DataAccessObject<Cliente> {

    @Override
    public void insere(Cliente entidade) {
        // TODO Auto-generated method stub
        String sql = "insert into produto (nome, preco) values(?, ?)";
        System.out.println("[ProdutoDaoMysql] SQL: " + sql);

    }

    @Override
    public List<Cliente> listaProdutos() {
        // TODO Auto-generated method stub
        return null;
    }

}
