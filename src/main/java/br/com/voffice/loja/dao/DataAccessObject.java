package br.com.voffice.loja.dao;

import java.util.List;

public interface DataAccessObject<E> {

    public void insere(E entidade);

    public List<E> listaProdutos();
}
