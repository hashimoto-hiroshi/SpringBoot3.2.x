package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.ExternalizedConfigurationService;

@SpringBootApplication
public class Application {

	private static ExternalizedConfigurationService externalizedConfigurationService;

	public Application(ExternalizedConfigurationService externalizedConfigurationService) {
		Application.externalizedConfigurationService = externalizedConfigurationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		externalizedConfigurationService.printExternalizedValues();
		
	}

}
