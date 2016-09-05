package be.bt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import be.bt.entities.MyUser;
import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.entities.UserRole;
import be.bt.repository.PersonRepository;
import be.bt.repository.ProfesionalListRepository;
import be.bt.repository.UserRepository;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	private UserRepository userRepositiry;

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private ProfesionalListRepository profesionalListRepository;
	

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

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void persistUserAndPerson(MyUser user, Person person) {

		// person.setUser(user);

		//userRepositiry.save(user);

		personRepository.save(person);

	}

	@Override
	public List<UserRole> getUserRole(MyUser user) {
		// TODO Auto-generated method stub
		return user.getUserRoles();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void persistUserAndPersonAndProfesional(MyUser user, Person person, ProfessionnalList profesional) {
		//userRepositiry.save(user);
	//	personRepository.save(person);
		profesionalListRepository.save(profesional);

	}

	@Override
	public MyUser findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepositiry.findByUsername(username);
	}

}
