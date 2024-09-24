package com.alvarto.alvarto_pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AlvartoPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlvartoPizzeriaApplication.class, args);
	}

}
