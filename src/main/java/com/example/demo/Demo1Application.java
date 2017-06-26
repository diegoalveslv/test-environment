package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo1Application extends SpringBootServletInitializer {
	
	private static Class<Demo1Application> applicationClass = Demo1Application.class;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}


@RestController
class HomeController {
		
	@RequestMapping("/")
	String hello() {
		return "hello!";
	}
	
	@RequestMapping("/test")
	String test() {
		return "test!";
	}
}
