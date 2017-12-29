package com.vae.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.util.db.MysqlUtils;
import com.vae.bean.Column;

public class ColumnDaoImpl implements ColumnDao {
	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public ColumnDaoImpl(){
		runner = new QueryRunner();
	}
	@Override
	public List<Column> findAll(String table) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select column_name,column_type,data_type,CHARACTER_MAXIMUM_LENGTH as column_length,column_comment "
					+"from information_schema.columns " 
					+"where TABLE_SCHEMA='sx_14' and table_name=?";
		List<Column> columns = runner.query(MysqlUtils.getConnection(), sql, new BeanListHandler<Column>(Column.class),table);
		return columns;
	}
}

