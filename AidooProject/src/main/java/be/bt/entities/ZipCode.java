package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the zip_code database table.
 * 
 */
@Entity
@Table(name="zip_code")
@NamedQuery(name="ZipCode.findAll", query="SELECT z FROM ZipCode z")
public class ZipCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="zip_code")
	private String zipCode;

	@Column(name="zip_name")
	private String zipName;

	//bi-directional many-to-one association to Person
	@OneToMany(mappedBy="zipCode")
	private List<Person> persons;

	public ZipCode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipName() {
		return this.zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Person addPerson(Person person) {
		getPersons().add(person);
		person.setZipCode(this);

		return person;
	}

	public Person removePerson(Person person) {
		getPersons().remove(person);
		person.setZipCode(null);

		return person;
	}

}