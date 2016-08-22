package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the msg_disc database table.
 * 
 */
@Entity
@Table(name="msg_disc")
@NamedQuery(name="MsgDisc.findAll", query="SELECT m FROM MsgDisc m")
public class MsgDisc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte active;

	private String contenu;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private byte read;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="Person_Id_sender")
	private Person person1;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="Person_Id1")
	private Person person2;

	//bi-directional many-to-one association to MsgObject
	@ManyToOne
	@JoinColumn(name="msg_object_Id")
	private MsgObject msgObject;

	public MsgDisc() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte getRead() {
		return this.read;
	}

	public void setRead(byte read) {
		this.read = read;
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

	public MsgObject getMsgObject() {
		return this.msgObject;
	}

	public void setMsgObject(MsgObject msgObject) {
		this.msgObject = msgObject;
	}

}