package com.valentinl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebApp  {
	public static void main(String [] args ){
		ConfigurableApplicationContext context =SpringApplication.run(WebApp.class);
		for (String name :  context.getBeanDefinitionNames()){
			System.out.println(name);
		}
		PersonController personController = context.getBean(PersonController.class);
		System.out.println(personController.createPerson());



//		Person person = context.getBean(Person.class);
//		person.setName("testName");
//		Person person2 = context.getBean(Person.class);
//		System.out.println(person.getI());
//		System.out.println(person2.getI());
//		person2.setName("testName2");
//		System.out.println(person.getName());
//		System.out.println(person2.getName());

	}
}
