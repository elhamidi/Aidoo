package be.bt.services;

import java.util.List;

import be.bt.entities.MyUser;
import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.entities.UserRole;


public interface IUserService {
	
	MyUser saveUser (MyUser user);

	void persistUserAndPerson(MyUser user, Person person);
	public List<UserRole> getUserRole(MyUser user);

	public MyUser findByUsername(String username);

	void persistUserAndPersonAndProfesional(MyUser user, Person person, ProfessionnalList profesional);
	

}
