package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dispo database table.
 * 
 */
@Entity
@NamedQuery(name="Dispo.findAll", query="SELECT d FROM Dispo d")
public class Dispo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Person
	@ManyToOne
	private Person person;

	//bi-directional many-to-one association to DayDispo
	@ManyToOne
	@JoinColumn(name="day_dispo_Id")
	private DayDispo dayDispo;

	//bi-directional many-to-one association to TimeSlot
	@ManyToOne
	@JoinColumn(name="time_slot_Id")
	private TimeSlot timeSlot;

	public Dispo() {
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

	public DayDispo getDayDispo() {
		return this.dayDispo;
	}

	public void setDayDispo(DayDispo dayDispo) {
		this.dayDispo = dayDispo;
	}

	public TimeSlot getTimeSlot() {
		return this.timeSlot;
	}

	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}

}