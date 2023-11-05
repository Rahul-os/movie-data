package com.neo4j.moviedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MovieDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDataApplication.class, args);
	}

}
