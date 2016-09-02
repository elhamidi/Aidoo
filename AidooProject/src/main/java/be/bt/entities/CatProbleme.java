package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cat_problemes database table.
 * 
 */
@Entity
@Table(name="cat_problemes")
@NamedQuery(name="CatProbleme.findAll", query="SELECT c FROM CatProbleme c")
public class CatProbleme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	public CatProbleme() {
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

}