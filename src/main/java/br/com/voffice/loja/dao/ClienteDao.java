package br.com.voffice.loja.dao;

import java.util.List;

import br.com.voffice.loja.model.Cliente;

public interface ClienteDao {
	public void insere(Cliente produto);
	public List<Cliente> listaProdutos();
}
