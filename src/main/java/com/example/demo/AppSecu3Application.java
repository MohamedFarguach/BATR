package com.example.demo;


import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.config.RsakeysConfig;



import com.example.demo.service.ServiceSec;
import com.example.demo.service.UsersService;

@SpringBootApplication
@EnableConfigurationProperties(RsakeysConfig.class)
public class AppSecu3Application {

	public static void main(String[] args) {
		SpringApplication.run(AppSecu3Application.class, args);
	}
	 @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }
	  @Bean
	  public PasswordEncoder passwordEncoder(){ 
		  return new
	                BCryptPasswordEncoder(); 
		  }
		CommandLineRunner start(ServiceSec accountService,UsersService service) {
			
			return args -> {
			
			
			};
	  }
	 

}
