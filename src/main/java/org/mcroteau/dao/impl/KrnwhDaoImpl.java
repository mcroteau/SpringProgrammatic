package org.mcroteau.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import org.mcroteau.dao.KrnwhDao;
import org.mcroteau.domain.Krnwh;

import java.util.List;

public class KrnwhDaoImpl extends JdbcDaoSupport implements KrnwhDao {
	
	public void save(){
		return new Object();
	}
	
	public List<Object> list(){
		return new List<Object>();
	}
	
	public Object update(Object krnwh){
		return krnwh;
	}

}









