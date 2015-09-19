package br.com.voffice.loja.dao.mysql;

import java.util.List;

import br.com.voffice.loja.dao.DataAccessObject;
import br.com.voffice.loja.dao.ProdutoDao;
import br.com.voffice.loja.model.Produto;

public class ProdutoDaoMysql implements DataAccessObject<Produto> {

    public void insere(Produto produto) {
        String sql = "insert into produto (nome, preco) values(?, ?)";
        System.out.println("[ProdutoDaoMysql] SQL: " + sql);
    }

    public List<Produto> listaProdutos() {
        // TODO Auto-generated method stub
        return null;
    }
}
