package com.valentinl;

import org.springframework.stereotype.Component;

@Component
public class PersonService implements PersonInterface{
	@Override
	public Person createPerson() {
		 Person person = new Person();
		 person.setName("tstName");
 		return person;
	}
}
