package com.vae.convert;

import java.util.HashMap;
import java.util.Map;

public class KeyDict {
	
	public static Map<String,String> getMap(){
		
		Map<String,String> m = new HashMap<String,String>();
		m.put("BIGINT","NUMBER(19,0)");
		m.put("BIT","RAW");
		m.put("BLOB","BLOB");
		m.put("CHAR","CHAR");
		m.put("DATE","DATE");
		m.put("DATETIME","DATE");
		m.put("DECIMAL","FLOAT (24)");
		m.put("DOUBLE","FLOAT (24)");
		m.put("DOUBLE PRECISION","FLOAT (24)");
		m.put("ENUM","VARCHAR2");
		m.put("FLOAT","FLOAT");
		m.put("INT","NUMBER(10,0)");
		m.put("INTEGER","NUMBER(10,0)");
		m.put("LONGBLOB","BLOB,RAW");
		m.put("LONGTEXT","CLOB,RAW");
		m.put("MEDIUMBLOB","BLOB,RAW");
		m.put("MEDIUMINT","NUMBER(7,0)");
		m.put("MEDIUMTEXT","CLOB,RAW");
		m.put("NUMERIC","NUMBER");
		m.put("REAL","FLOAT (24)");
		m.put("SET","VARCHAR2");
		m.put("SMALLINT","NUMBER(5,0)");
		m.put("TEXT","VARCHAR2,CLOB");
		m.put("TIME","DATE");
		m.put("TIMESTAMP","DATE");
		m.put("TINYBLOB","RAW");
		m.put("TINYINT","NUMBER(3,0)");
		m.put("TINYTEXT","VARCHAR2");
		m.put("VARCHAR","VARCHAR2,CLOB");
		m.put("YEAR","NUMBER");
		
		return m;
	}
}
