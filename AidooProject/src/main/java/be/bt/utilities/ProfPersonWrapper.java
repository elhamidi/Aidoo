package be.bt.utilities;

import be.bt.entities.Announce;
import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;

public class ProfPersonWrapper {

	private ProfessionnalList professional;
	private Person person;
	private Announce annonce;
	
	
	
	
	public ProfPersonWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the professional
	 */
	public ProfessionnalList getProfessional() {
		return professional;
	}
	/**
	 * @param professional the professional to set
	 */
	public void setProfessional(ProfessionnalList professional) {
		this.professional = professional;
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
	 * @return the annonce
	 */
	public Announce getAnnonce() {
		return annonce;
	}
	/**
	 * @param annonce the annonce to set
	 */
	public void setAnnonce(Announce annonce) {
		this.annonce = annonce;
	}
	
	
	
}
