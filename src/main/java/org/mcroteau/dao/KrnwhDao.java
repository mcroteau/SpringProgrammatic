package org.mcroteau.dao;

import java.util.List;

public interface KrnwhDao {
	
	public List<Object> list();
	
	public void save(Object krnwh);
	
	public Object update(Object krnwh);
	
}