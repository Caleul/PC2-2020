package model.dao;

import java.util.List;

import model.entities.Hospedagem;

public interface HospedagemDao {
	
	void insert(Hospedagem obj);
	void update (Hospedagem obj);
	void deleteById(Integer id);
	Hospedagem findById(Integer id);
	List<Hospedagem> findAll();
}