package org.mcroteau;

import org.apache.log4j.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	final static Logger log = Logger.getLogger(Application.class);

	public static void main(String args[]){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ApplicationContextProvider provider = new ApplicationContextProvider(context);
		ApplicationRunner runner = (ApplicationRunner)context.getBean("applicationRunner");
		runner.run();
	}
}