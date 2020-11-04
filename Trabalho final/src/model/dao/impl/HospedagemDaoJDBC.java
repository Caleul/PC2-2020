package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import database.ConnectionFactory;
import database.DbException;
import model.dao.HospedagemDao;
import model.entities.Hospedagem;

public class HospedagemDaoJDBC implements HospedagemDao{
	
	private Connection conn;
	
	public HospedagemDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Hospedagem obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO Hospedagem "
					+ "(codHospedagem, estado, dataInicio, dataFim, qtdPessoas, desconto, valorFinal) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getCodHospedagem());
			st.setString(2, obj.getEstado());
			st.setDate(3, new java.sql.Date(obj.getDataInicio().getTime()));
			st.setDate(4, new java.sql.Date(obj.getDataFim().getTime()));
			st.setInt(5, obj.getQtdPessoas());
			st.setDouble(6, obj.getDesconto());
			st.setDouble(7, obj.getValorFinal());
	
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
	public void update(Hospedagem obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE Hospedagem "
					+ "SET codHospedagem = ?, estado = ?, dataInicio = ?, dataFim = ?, qtdPessoas = ?, desconto = ?, valorFinal = ? "
					+ "WHERE codHospedagem = ?");
			
			st.setInt(1, obj.getCodHospedagem());
			st.setString(2, obj.getEstado());
			st.setDate(3, new java.sql.Date(obj.getDataInicio().getTime()));
			st.setDate(4, new java.sql.Date(obj.getDataFim().getTime()));
			st.setInt(5, obj.getQtdPessoas());
			st.setDouble(6, obj.getDesconto());
			st.setDouble(7, obj.getValorFinal());
			st.setInt(8, obj.getCodHospedagem());
	
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
			st = conn.prepareStatement("DELETE FROM Hospedagem WHERE codHospedagem = ?");
			
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
	public Hospedagem findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospedagem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
