package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the frequency_dispo database table.
 * 
 */
@Entity
@Table(name="frequency_dispo")
@NamedQuery(name="FrequencyDispo.findAll", query="SELECT f FROM FrequencyDispo f")
public class FrequencyDispo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Person
	@ManyToOne
	private Person person;

	//bi-directional many-to-one association to CatFrequencyDispo
	@ManyToOne
	@JoinColumn(name="cat_frequency_dispo_Id")
	private CatFrequencyDispo catFrequencyDispo;

	public FrequencyDispo() {
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

	public CatFrequencyDispo getCatFrequencyDispo() {
		return this.catFrequencyDispo;
	}

	public void setCatFrequencyDispo(CatFrequencyDispo catFrequencyDispo) {
		this.catFrequencyDispo = catFrequencyDispo;
	}

}