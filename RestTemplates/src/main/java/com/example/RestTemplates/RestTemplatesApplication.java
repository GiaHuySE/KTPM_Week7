package com.example.RestTemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplatesApplication.class, args);
	}

	@Bean
	public  RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
