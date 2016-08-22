package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the time_slot database table.
 * 
 */
@Entity
@Table(name="time_slot")
@NamedQuery(name="TimeSlot.findAll", query="SELECT t FROM TimeSlot t")
public class TimeSlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	//bi-directional many-to-one association to Dispo
	@OneToMany(mappedBy="timeSlot")
	private List<Dispo> dispos;

	public TimeSlot() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Dispo> getDispos() {
		return this.dispos;
	}

	public void setDispos(List<Dispo> dispos) {
		this.dispos = dispos;
	}

	public Dispo addDispo(Dispo dispo) {
		getDispos().add(dispo);
		dispo.setTimeSlot(this);

		return dispo;
	}

	public Dispo removeDispo(Dispo dispo) {
		getDispos().remove(dispo);
		dispo.setTimeSlot(null);

		return dispo;
	}

}