package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the announce database table.
 * 
 */
@Entity
@NamedQuery(name="Announce.findAll", query="SELECT a FROM Announce a")
public class Announce implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String announcecol;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_creation")
	private Date dateCreation;

	

	private String text;

	private String title;

	//bi-directional many-to-one association to CategoryAnnounce
	@ManyToOne
	@JoinColumn(name="category_announce_id")
	private CategoryAnnounce categoryAnnounce;

	//bi-directional many-to-one association to Person
	@ManyToOne
	private Person person;

	public Announce() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnnouncecol() {
		return this.announcecol;
	}

	public void setAnnouncecol(String announcecol) {
		this.announcecol = announcecol;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryAnnounce getCategoryAnnounce() {
		return this.categoryAnnounce;
	}

	public void setCategoryAnnounce(CategoryAnnounce categoryAnnounce) {
		this.categoryAnnounce = categoryAnnounce;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}