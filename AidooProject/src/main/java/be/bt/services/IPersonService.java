package be.bt.services;

import java.util.List;

import be.bt.entities.Person;

public interface IPersonService {
	
	
	List<Person> findPersonByZipCode(String zipCode);

}
