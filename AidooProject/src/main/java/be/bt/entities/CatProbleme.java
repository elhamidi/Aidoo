package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cat_problemes database table.
 * 
 */
@Entity
@Table(name="cat_problemes")
@NamedQuery(name="CatProbleme.findAll", query="SELECT c FROM CatProbleme c")
public class CatProbleme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to Person
	@OneToMany(mappedBy="catProbleme")
	private List<Person> persons;

	public CatProbleme() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Person addPerson(Person person) {
		getPersons().add(person);
		person.setCatProbleme(this);

		return person;
	}

	public Person removePerson(Person person) {
		getPersons().remove(person);
		person.setCatProbleme(null);

		return person;
	}

}