package com.JsonExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.JsonExample","com.JsonExample.config","com.JsonExample.controller","com.JsonExample.UserService"})
@SpringBootApplication
public class JsonExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonExampleApplication.class, args);
	}

}

