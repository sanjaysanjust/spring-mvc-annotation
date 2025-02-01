package org.sanjay.app;

import org.sanjay.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		MyServiceClient client = (MyServiceClient) context.getBean(MyServiceClient.class);
		client.execute();
		context.close();
		
	}

}
