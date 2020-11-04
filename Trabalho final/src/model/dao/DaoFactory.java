package model.dao;

import database.ConnectionFactory;
import model.dao.impl.ChaleDaoJDBC;
import model.dao.impl.ClienteDaoJDBC;
import model.dao.impl.HospedagemDaoJDBC;
public class DaoFactory {
	
	public static ClienteDao createClienteDao() {
		return new ClienteDaoJDBC(ConnectionFactory.getConnection());
	}
	
	public static ChaleDao createChaleDao() {
		return new ChaleDaoJDBC(ConnectionFactory.getConnection());
	}
	
	public static HospedagemDao createHospedagemDao() {
		return new HospedagemDaoJDBC(ConnectionFactory.getConnection());
	}

}
