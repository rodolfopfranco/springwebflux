package com.spring.spring.Webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebfluxApplication {

	public static void main(String[] args) {
		System.out.println("We are using Netty instead of Tomcat!");
		SpringApplication.run(SpringWebfluxApplication.class, args);
	}

}
