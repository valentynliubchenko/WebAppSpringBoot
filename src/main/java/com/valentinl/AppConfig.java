package com.valentinl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
//	@Scope("prototype")
	public Person myPperson(){
		return new Person();
	}
}
