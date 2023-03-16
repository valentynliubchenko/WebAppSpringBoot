package com.valentinl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {
	@Value("${my.hello}")
	private String hello;

	@Autowired
	Person myPerson;
	@Autowired
	@Qualifier("personService")
	private PersonInterface personInterface;
	@RequestMapping(method = RequestMethod.GET, value = "/createPerson")
	public Person createPerson(){
		return personInterface.createPerson();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/info")
	public String getInfo(@RequestParam(required = false) String name){
		System.out.println("valenitnl " +myPerson.getName());
		return hello + " " + name;
	}

//	@RequestMapping(method = RequestMethod.GET, value = "/createPerson")
//	public ResponseEntity<Person> createPerson(){
//		return new ResponseEntity<>(personInterface.createPerson(), HttpStatusCode.valueOf(200));
//	}


}
