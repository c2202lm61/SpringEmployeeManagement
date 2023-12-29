package com.developer.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}
	@GetMapping(path = "/")
	public String hello(){
		return ("Hello world");
	}
//	@Bean
//	public CommandLineRunner demo(DepartmentRepository departmentRepository){
//		return args -> {
//			departmentRepository.save(new Department("Ke toan"));
//			departmentRepository.save(new Department("Chu tich"));
//		};
//	}
}
