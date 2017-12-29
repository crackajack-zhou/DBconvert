package com.vae.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.util.db.MysqlUtils;
import com.vae.bean.Schema;

public class SchemaDaoImpl implements SchemaDao {
	private QueryRunner runner = null;//查询运行器
	public SchemaDaoImpl(){
		runner = new QueryRunner();
	}
	
	//方法：使用BeanListHandler查询所有对象
	@Override
	public List<Schema> findAll() throws SQLException {
		String sql = "select table_name,table_comment from information_schema.tables where TABLE_SCHEMA='sx_14'";
		List<Schema> schemas = runner.query(MysqlUtils.getConnection(), sql, new BeanListHandler<Schema>(Schema.class));
		return schemas;
	}

}

