package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cat_frequency_dispo database table.
 * 
 */
@Entity
@Table(name="cat_frequency_dispo")
@NamedQuery(name="CatFrequencyDispo.findAll", query="SELECT c FROM CatFrequencyDispo c")
public class CatFrequencyDispo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to FrequencyDispo
	@OneToMany(mappedBy="catFrequencyDispo")
	private List<FrequencyDispo> frequencyDispos;

	public CatFrequencyDispo() {
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

	public List<FrequencyDispo> getFrequencyDispos() {
		return this.frequencyDispos;
	}

	public void setFrequencyDispos(List<FrequencyDispo> frequencyDispos) {
		this.frequencyDispos = frequencyDispos;
	}

	public FrequencyDispo addFrequencyDispo(FrequencyDispo frequencyDispo) {
		getFrequencyDispos().add(frequencyDispo);
		frequencyDispo.setCatFrequencyDispo(this);

		return frequencyDispo;
	}

	public FrequencyDispo removeFrequencyDispo(FrequencyDispo frequencyDispo) {
		getFrequencyDispos().remove(frequencyDispo);
		frequencyDispo.setCatFrequencyDispo(null);

		return frequencyDispo;
	}

}