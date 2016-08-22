package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the msg_object database table.
 * 
 */
@Entity
@Table(name="msg_object")
@NamedQuery(name="MsgObject.findAll", query="SELECT m FROM MsgObject m")
public class MsgObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_creation")
	private Date dateCreation;

	private String object;

	//bi-directional many-to-one association to MsgDisc
	@OneToMany(mappedBy="msgObject")
	private List<MsgDisc> msgDiscs;

	public MsgObject() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public List<MsgDisc> getMsgDiscs() {
		return this.msgDiscs;
	}

	public void setMsgDiscs(List<MsgDisc> msgDiscs) {
		this.msgDiscs = msgDiscs;
	}

	public MsgDisc addMsgDisc(MsgDisc msgDisc) {
		getMsgDiscs().add(msgDisc);
		msgDisc.setMsgObject(this);

		return msgDisc;
	}

	public MsgDisc removeMsgDisc(MsgDisc msgDisc) {
		getMsgDiscs().remove(msgDisc);
		msgDisc.setMsgObject(null);

		return msgDisc;
	}

}