package com.simplilearn.FoodApp;

//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan(basePackages=
{"com.simplilearn.FoodApp.Controller","com.simplilearn.FoodApp.db","com.simplilearn.FoodApp.model","com.simplilearn.FoodApp.service","com.simplilearn.FoodApp.Utility"})
public class FoodAppApplication {
	
	 @Autowired
	    private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(FoodAppApplication.class, args);
	}
	
	

	
}



