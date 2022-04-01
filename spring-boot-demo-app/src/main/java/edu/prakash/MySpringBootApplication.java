package edu.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableAutoConfiguration - automatically configures your Spring application based on the JAR dependencies you added in the project
// @ComponentScan - scans all the beans and package declarations when the application initializes
// @SpringBootConfiguration 
@SpringBootApplication
public class MySpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
