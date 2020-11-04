package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import database.ConnectionFactory;
import database.DbException;
import model.dao.ChaleDao;
import model.entities.Chale;

public class ChaleDaoJDBC implements ChaleDao {
	
	private Connection conn;
	
	public ChaleDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Chale obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO Chale "
					+ "(codChale, localizacao, capacidade, valorAltaE, valorBaixaE) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getCodChale());
			st.setString(2, obj.getLocalizacao());
			st.setInt(3, obj.getCapacidade());
			st.setDouble(4, obj.getValorAltaE());
			st.setDouble(5, obj.getValorBaixaE());
			
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
	public void update(Chale obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE Hospedagem "
					+ "SET codChale = ?, localizacao = ?, capacidade = ?, valorAltaE = ?, valorBaixaE = ? "
					+ "WHERE codChale = ?");
			
			st.setInt(1, obj.getCodChale());
			st.setString(2, obj.getLocalizacao());
			st.setInt(3, obj.getCapacidade());
			st.setDouble(4, obj.getValorAltaE());
			st.setDouble(5, obj.getValorBaixaE());
			st.setInt(6, obj.getCodChale());
			
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
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM Chale WHERE codChale = ?");
			
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
	public Chale findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chale> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
