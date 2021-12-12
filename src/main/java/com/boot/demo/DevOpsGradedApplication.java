package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsGradedApplication {

	public static void main(String[] args) {
		System.out.println("Hello Dev-Ops");
		SpringApplication.run(DevOpsGradedApplication.class, args);
	}

}
