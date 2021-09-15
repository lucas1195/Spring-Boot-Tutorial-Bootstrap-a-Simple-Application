package com.example.Atividade3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@ComponentScan({"com.delivery.request"})
@EnableJpaRepositories("com.example.Atividade3") 
@EntityScan("com.example.Atividade3")
@SpringBootApplication(scanBasePackages = "com.example.Atividade3")
public class Atividade3Application {
    
	public static void main(String[] args) {
        
		SpringApplication.run(Atividade3Application.class, args);
    }

}