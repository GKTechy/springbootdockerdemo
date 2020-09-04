package com.app.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootdockerdemoApplication {

	public static void main(String[] args) {	SpringApplication.run(SpringbootdockerdemoApplication.class, args);	}
	
	@RestController
	static final class mycontroller{
		
		@GetMapping("/hello")
		String hello() {
			return "Hello GK Techy";
		}
	}

}
