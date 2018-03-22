package org.mcroteau.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import org.mcroteau.dao.KrnwhDao;

import java.util.List;
import java.util.ArrayList;

public class KrnwhDaoImpl extends JdbcDaoSupport implements KrnwhDao {

	public List<Object> list(){
		return new ArrayList<Object>();
	}
	
	public void save(Object krnwh){}
	
	public Object update(Object krnwh){
		return krnwh;
	}

}









