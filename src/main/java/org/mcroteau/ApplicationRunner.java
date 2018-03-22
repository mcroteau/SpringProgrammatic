package org.mcroteau;import com.sun.jersey.api.client.config.DefaultClientConfig;

import org.apache.log4j.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

import org.springframework.beans.factory.annotation.Value;


import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigDecimal;

import org.mcroteau.domain.KRNWH;
import org.mcroteau.dao.impl.KrnwhDaoImpl;


public class ApplicationRunner {

	@Autowired
	private KrnwhDaoImpl dao;

	final static Logger log = Logger.getLogger(ApplicationRunner.class);

	public ApplicationRunner(){}


	public void run(){
		log.info("run");
	}


}

















