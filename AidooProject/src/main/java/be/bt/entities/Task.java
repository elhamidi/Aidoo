package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the task database table.
 * 
 */
@Entity
@NamedQuery(name="Task.findAll", query="SELECT t FROM Task t")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int exp;

	//bi-directional many-to-one association to CatTask
	@ManyToOne
	@JoinColumn(name="cat_task_Id")
	private CatTask catTask;

	//bi-directional many-to-one association to Person
	@ManyToOne
	private Person person;

	public Task() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExp() {
		return this.exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public CatTask getCatTask() {
		return this.catTask;
	}

	public void setCatTask(CatTask catTask) {
		this.catTask = catTask;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}