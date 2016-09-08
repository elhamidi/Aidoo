package be.bt.services;

import java.util.List;

import be.bt.entities.Person;


public interface IPersonService {
	
	
	List<Person> findPersonByZipCode(String zipCode);
	Person save(Person p );
	
	Person findByUser(String user);
	
	Person savePerson(Person p );

}
