package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the day_dispo database table.
 * 
 */
@Entity
@Table(name="day_dispo")
@NamedQuery(name="DayDispo.findAll", query="SELECT d FROM DayDispo d")
public class DayDispo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String details;

	//bi-directional many-to-one association to Dispo
	@OneToMany(mappedBy="dayDispo")
	private List<Dispo> dispos;

	public DayDispo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public List<Dispo> getDispos() {
		return this.dispos;
	}

	public void setDispos(List<Dispo> dispos) {
		this.dispos = dispos;
	}

	public Dispo addDispo(Dispo dispo) {
		getDispos().add(dispo);
		dispo.setDayDispo(this);

		return dispo;
	}

	public Dispo removeDispo(Dispo dispo) {
		getDispos().remove(dispo);
		dispo.setDayDispo(null);

		return dispo;
	}

}