package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.example.demo.entity.UserDetails;

@SpringBootApplication
@EnableResourceServer
public class OauthPasswordApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthPasswordApplication.class, args);
	}
//	@Bean
//	public UserDetails ramesh() {
//		
//		return new UserDetails("Ramesh Patil","@#$5!@#","punnya","ram","2022-12-17","kk","9:30","#@%&%$3");
	@Bean
	public BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}

}
