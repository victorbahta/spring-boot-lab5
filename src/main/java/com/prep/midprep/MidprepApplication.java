package com.prep.midprep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
public class MidprepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MidprepApplication.class, args);
	}

}

