package com.drucare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class StudentDataApi1Application {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
@Bean
	public WebClient.Builder getWebClient(){
		return WebClient.builder();
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentDataApi1Application.class, args);
	}

}
