package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the comment database table.
 * 
 */
@Entity
@NamedQuery(name="Comment.findAll", query="SELECT c FROM Comment c")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="comment_cotation")
	private int commentCotation;

	private String content;

	@Temporal(TemporalType.DATE)
	@Column(name="date_created")
	private Date dateCreated;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="commented_id")
	private Person person1;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="commentator_id")
	private Person person2;

	public Comment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommentCotation() {
		return this.commentCotation;
	}

	public void setCommentCotation(int commentCotation) {
		this.commentCotation = commentCotation;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Person getPerson1() {
		return this.person1;
	}

	public void setPerson1(Person person1) {
		this.person1 = person1;
	}

	public Person getPerson2() {
		return this.person2;
	}

	public void setPerson2(Person person2) {
		this.person2 = person2;
	}

}