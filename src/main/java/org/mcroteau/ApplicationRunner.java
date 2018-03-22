package org.mcroteau;

import org.springframework.beans.factory.annotation.Autowired;

import org.apache.log4j.Logger;

import org.mcroteau.dao.impl.KrnwhDaoImpl;


public class ApplicationRunner {

	@Autowired
	private KrnwhDaoImpl krnwhDao;

	final static Logger log = Logger.getLogger(ApplicationRunner.class);

	public ApplicationRunner(){}


	public void run(){
		log.info("run");
	}


}

















