package org.mcroteau;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import org.springframework.core.io.ClassPathResource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import org.mcroteau.dao.impl.KrnwhDaoImpl;



@Configuration
@ComponentScan(basePackages = { "org.mcroteau.*" })
public class ApplicationConfig {
	
	@Value("${db.username}")
	private String username;

	@Value("${db.password}")
	private String password;

	final static Logger log = Logger.getLogger(ApplicationConfig.class);

	public ApplicationConfig(){	}
	

    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner();
    }
	
	
    @Bean
    public KrnwhDaoImpl krnwhDaoImpl() {
		KrnwhDaoImpl p = new KrnwhDaoImpl();
		p.setDataSource(dataSource());
        return p;
    }
	
	
	@Bean 
	public DataSource dataSource(){
		
		try{
			
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");//
			dataSource.setUrl("jdbc:mysql://localhost:3306/mcroteau");
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			
			return dataSource;
			
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}

	
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer ppc = new PropertySourcesPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("application.properties"));
        return ppc;
    }
	
}