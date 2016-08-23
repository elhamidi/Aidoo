package be.bt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import be.bt.entities.Person;
import be.bt.repository.PersonRepository;

public class PersonServiceImp implements IPersonService {

	@Autowired
	PersonRepository personRepository;
	@Override
	public List<Person> findPersonByZipCode(String zipCode) {
		
		
		return personRepository.findByZipCode(zipCode);
		
		
	}

}
