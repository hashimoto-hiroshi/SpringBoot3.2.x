package com.example.demo.service;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ExternalizedConfigurationService {

	private final Environment environment;

	public ExternalizedConfigurationService(Environment environment) {
		super();
		this.environment = environment;
	}
	
	public void printExternalizedValues() {
		System.out.println("------------------------");
		System.out.println("spring.profiles.active: " + environment.getProperty("spring.profiles.active"));
		System.out.println("spring.whoami: " + environment.getProperty("spring.whoami"));
		System.out.println("spring.common-value: " + environment.getProperty("spring.common-value"));
		System.out.println("spring.test-value: " + environment.getProperty("spring.test-value"));
		System.out.println("------------------------");
	}

}
