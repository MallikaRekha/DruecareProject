package io.Drucare.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration

@PropertySource("classpath:application.properties")
@SpringBootApplication
public class HospiDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospiDetailsApplication.class, args);
	}

}
