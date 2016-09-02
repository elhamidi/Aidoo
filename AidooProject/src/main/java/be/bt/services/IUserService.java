package be.bt.services;

import be.bt.entities.MyUser;
import be.bt.entities.Person;


public interface IUserService {
	
	MyUser saveUser (MyUser user);

	void persistUserAndPerson(MyUser user, Person person);
	
	

}
