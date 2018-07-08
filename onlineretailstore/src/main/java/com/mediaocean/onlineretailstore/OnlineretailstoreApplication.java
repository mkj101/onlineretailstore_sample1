package com.mediaocean.onlineretailstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class OnlineretailstoreApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(OnlineretailstoreApplication.class);
		Environment env = app.run(args).getEnvironment();
		
		System.out.println("Starting application..");
		
	}
}
