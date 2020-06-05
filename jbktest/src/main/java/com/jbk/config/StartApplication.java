package com.jbk.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jbk")
public class StartApplication {
public static void main(String[] args) {
	SpringApplication.run(StartApplication.class, args);
}
}
