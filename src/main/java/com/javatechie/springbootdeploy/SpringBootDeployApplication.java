package com.javatechie.springbootdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDeployApplication {

	@GetMapping("/message")
	public String message(){
		return "Congratulations! your app deployed successfully in Azure.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeployApplication.class, args);
	}

}
