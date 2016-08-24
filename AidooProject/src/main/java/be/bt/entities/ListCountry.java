package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the list_country database table.
 * 
 */
@Entity
@Table(name="list_country")
@NamedQuery(name="ListCountry.findAll", query="SELECT l FROM ListCountry l")
public class ListCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="country_name")
	private String countryName;

	//bi-directional many-to-one association to Person
	@OneToMany(mappedBy="listCountry")
	private List<Person> persons;

	public ListCountry() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Person addPerson(Person person) {
		getPersons().add(person);
		person.setListCountry(this);

		return person;
	}

	public Person removePerson(Person person) {
		getPersons().remove(person);
		person.setListCountry(null);

		return person;
	}

}