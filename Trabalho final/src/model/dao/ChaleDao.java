package model.dao;

import java.util.List;

import model.entities.Chale;

public interface ChaleDao {
	
	void insert(Chale obj);
	void update (Chale obj);
	void deleteById(Integer id);
	Chale findById(Integer id);
	List<Chale> findAll();
}