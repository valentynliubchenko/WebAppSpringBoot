package com.valentinl.services;
import com.valentinl.Person;
import com.valentinl.PersonInterface;
import org.springframework.stereotype.Service;

@Service("customPersonService")
public class PersonService implements PersonInterface {
	@Override
	public Person createPerson() {
		Person person = new Person();
		person.setName("newNAme");
		return person;
	}
}
