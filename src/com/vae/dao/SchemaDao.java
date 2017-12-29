package com.vae.dao;

import java.sql.SQLException;
import java.util.List;

import com.vae.bean.Schema;

public interface SchemaDao {

	// ВщевЫљга
	public List<Schema> findAll() throws SQLException;

	
}
