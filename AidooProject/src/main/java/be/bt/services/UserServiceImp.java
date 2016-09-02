package be.bt.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import be.bt.entities.MyUser;
import be.bt.entities.Person;

import be.bt.repository.PersonRepository;
import be.bt.repository.UserRepository;

@Service
public class UserServiceImp implements IUserService {
	
	@Autowired 
	private UserRepository userRepositiry;
	
	@Autowired 
	private PersonRepository personRepository;

	
	
	
	public UserRepository getUserRepositiry() {
		return userRepositiry;
	}
	public void setUserRepositiry(UserRepository userRepositiry) {
		this.userRepositiry = userRepositiry;
	}
	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}


	@Override
	public MyUser saveUser(MyUser user) {
		
		return userRepositiry.save(user);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void persistUserAndPerson(MyUser user, Person person) {
		
		//MyUser u= userRepositiry.save(user);
		//person.setUser(u);
		
//		List<Person> personnes = user.getPersons();
//		if (personnes == null) {
//			personnes = new ArrayList<Person>();
//		}
//		personnes.add(person);
//		user.setPersons(personnes);
		
		person.setUser(user);
		
		userRepositiry.save(user);
		
		personRepository.save(person);
		
		
		
	
	}

}
