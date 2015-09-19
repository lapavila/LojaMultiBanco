package br.com.voffice.loja.dao;

import java.util.List;

import br.com.voffice.loja.model.Produto;

public interface ProdutoDao {

    public void insere(Produto produto);

    public List<Produto> listaProdutos();
}
