package com.example.activityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivityserviceApplication {

	public static void main(String[] args) {
        System.out.println("start");
		SpringApplication.run(ActivityserviceApplication.class, args);
        System.out.println("end");

    }

}
