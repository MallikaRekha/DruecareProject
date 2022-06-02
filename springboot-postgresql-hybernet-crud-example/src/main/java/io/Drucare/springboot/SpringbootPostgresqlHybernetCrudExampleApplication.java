package io.Drucare.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration

@PropertySource("classpath:application.properties")
@SpringBootApplication

public class SpringbootPostgresqlHybernetCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlHybernetCrudExampleApplication.class, args);
	}

}
