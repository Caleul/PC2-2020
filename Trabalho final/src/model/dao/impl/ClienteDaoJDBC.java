package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import database.ConnectionFactory;
import database.DbException;
import model.dao.ClienteDao;
import model.entities.Cliente;

public class ClienteDaoJDBC implements ClienteDao {
	
	private Connection conn;
	
	public ClienteDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Cliente obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO Cliente "
					+ "(rgCliente, nomeCliente, estadoCliente, enderecoCliente, codCliente, cidadeCliente, bairroCliente, CEPCliente, nascimentoCliente) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getRgCliente());
			st.setString(2, obj.getNomeCliente());
			st.setString(3, obj.getEstadoCliente());
			st.setString(4, obj.getEnderecoCliente());
			st.setInt(5, obj.getCodCliente());
			st.setString(6, obj.getCidadeCliente());
			st.setString(7, obj.getBairroCliente());
			st.setString(8, obj.getCEPCliente());
			st.setDate(9, new java.sql.Date(obj.getNascimentoCliente().getTime()));
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected < 1) {
				throw new DbException("ERRO!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		finally {
			ConnectionFactory.closeStatement(st);
		}
		
	}

	@Override
	public void update(Cliente obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE Cliente "
					+ "SET rgCliente = ?, nomeCliente = ?, estadoCliente = ?, enderecoCliente = ?, CodCliente = ?, cidadeCliente = ?, bairroCliente = ?, CEPCliente = ?, nascimentoCliente = ? "
					+ "WHERE codCliente = ?");
			
			st.setString(1, obj.getRgCliente());
			st.setString(2, obj.getNomeCliente());
			st.setString(3, obj.getEstadoCliente());
			st.setString(4, obj.getEnderecoCliente());
			st.setInt(5, obj.getCodCliente());
			st.setString(6, obj.getCidadeCliente());
			st.setString(7, obj.getBairroCliente());
			st.setString(8, obj.getCEPCliente());
			st.setDate(9, new java.sql.Date(obj.getNascimentoCliente().getTime()));
			st.setInt(10, obj.getCodCliente());
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected < 1) {
				throw new DbException("ERRO!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		finally {
			ConnectionFactory.closeStatement(st);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM Cliente WHERE codCliente = ?");
			
			st.setInt(1, id);
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			ConnectionFactory.closeStatement(st);
		}
		
	}

	@Override
	public Cliente findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
