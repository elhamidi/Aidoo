package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the person_has_language database table.
 * 
 */
@Entity
@Table(name="person_has_language")
@NamedQuery(name="PersonHasLanguage.findAll", query="SELECT p FROM PersonHasLanguage p")
public class PersonHasLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Person
	@ManyToOne
	private Person person;

	//bi-directional many-to-one association to Language
	@ManyToOne
	private Language language;

	public PersonHasLanguage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}