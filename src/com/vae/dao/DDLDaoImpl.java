package com.vae.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.util.db.MysqlUtils;
import com.util.db.OracleUtils;

public class DDLDaoImpl{
	
	private static QueryRunner runner = new QueryRunner();//²éÑ¯ÔËĞĞÆ÷

	public static boolean execute(String sql) throws SQLException {
		
		return runner.update(MysqlUtils.getConnection(),sql) >0 ? true:false;
	}
}

