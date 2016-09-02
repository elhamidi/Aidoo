package be.bt.utilities;

import javax.validation.Valid;

import be.bt.entities.Person;
import be.bt.entities.MyUser;

public class UserPersonWrapper {
	@Valid
	private Person person;
	@Valid
	private MyUser user;
	
	
	
	
	public UserPersonWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the user
	 */
	public MyUser getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(MyUser user) {
		this.user = user;
	}
	
	

}
