package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cat_task database table.
 * 
 */
@Entity
@Table(name="cat_task")
@NamedQuery(name="CatTask.findAll", query="SELECT c FROM CatTask c")
public class CatTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String task;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="catTask")
	private List<Task> tasks;

	public CatTask() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setCatTask(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setCatTask(null);

		return task;
	}

}