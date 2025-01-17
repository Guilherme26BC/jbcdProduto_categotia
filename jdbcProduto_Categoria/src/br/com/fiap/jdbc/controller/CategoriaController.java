package br.com.fiap.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.jdbc.dao.CategoriaDAO;
import br.com.fiap.jdbc.factory.ConnectionFactoryPool;
import br.com.fiap.model.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() throws SQLException {
		
		Connection connection = ConnectionFactoryPool.getConnection();
		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listarTodas()throws SQLException{
		return this.categoriaDAO.listarTodas();
	}
	public List<Categoria> listarComProdutos()throws SQLException{
		return this.categoriaDAO.listarComProduto();
	}
	public void salvarCategoria(Categoria categoria)throws SQLException{
		 this.categoriaDAO.salvarCategoria(categoria);
	}
	public void alterar(Categoria categoria)throws SQLException{
		this.categoriaDAO.alterar(categoria);
	}
	public void excluit(int id)throws SQLException{
		this.categoriaDAO.excluir(id);
	}
}
