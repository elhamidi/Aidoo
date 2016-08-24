package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the category_announce database table.
 * 
 */
@Entity
@Table(name="category_announce")
@NamedQuery(name="CategoryAnnounce.findAll", query="SELECT c FROM CategoryAnnounce c")
public class CategoryAnnounce implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to Announce
	@OneToMany(mappedBy="categoryAnnounce")
	private List<Announce> announces;

	public CategoryAnnounce() {
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

	public List<Announce> getAnnounces() {
		return this.announces;
	}

	public void setAnnounces(List<Announce> announces) {
		this.announces = announces;
	}

	public Announce addAnnounce(Announce announce) {
		getAnnounces().add(announce);
		announce.setCategoryAnnounce(this);

		return announce;
	}

	public Announce removeAnnounce(Announce announce) {
		getAnnounces().remove(announce);
		announce.setCategoryAnnounce(null);

		return announce;
	}

}