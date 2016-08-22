package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the language database table.
 * 
 */
@Entity
@NamedQuery(name="Language.findAll", query="SELECT l FROM Language l")
public class Language implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String desc;

	//bi-directional many-to-one association to PersonHasLanguage
	@OneToMany(mappedBy="language")
	private List<PersonHasLanguage> personHasLanguages;

	public Language() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<PersonHasLanguage> getPersonHasLanguages() {
		return this.personHasLanguages;
	}

	public void setPersonHasLanguages(List<PersonHasLanguage> personHasLanguages) {
		this.personHasLanguages = personHasLanguages;
	}

	public PersonHasLanguage addPersonHasLanguage(PersonHasLanguage personHasLanguage) {
		getPersonHasLanguages().add(personHasLanguage);
		personHasLanguage.setLanguage(this);

		return personHasLanguage;
	}

	public PersonHasLanguage removePersonHasLanguage(PersonHasLanguage personHasLanguage) {
		getPersonHasLanguages().remove(personHasLanguage);
		personHasLanguage.setLanguage(null);

		return personHasLanguage;
	}

}