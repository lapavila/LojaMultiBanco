package br.com.voffice.loja.dao.postgres;

import java.util.List;

import br.com.voffice.loja.dao.DataAccessObject;
import br.com.voffice.loja.model.Produto;

public class ProdutoDaoPostgres implements DataAccessObject<Produto> {

    public void insere(Produto produto) {
        String sql = "insert into produto (id, nome, preco) values(nextval('seq_produto'), ?, ?)";
        System.out.println("[ProdutoDaoPostgres] SQL: " + sql);
    }

    public List<Produto> listaProdutos() {
        // TODO Auto-generated method stub
        return null;
    }

}
