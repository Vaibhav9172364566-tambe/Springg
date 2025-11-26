package com.fitness.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
        System.out.println("start..................");
		SpringApplication.run(UserserviceApplication.class, args);
        System.out.println("end.........................");
	}

}

