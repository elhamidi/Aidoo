package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the professionnal_list database table.
 * 
 */
@Entity
@Table(name="professionnal_list")
@NamedQuery(name="ProfessionnalList.findAll", query="SELECT p FROM ProfessionnalList p")
public class ProfessionnalList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_professionnal_list")
	private int idProfessionnalList;

	@Column(name="car_licence")
	private byte carLicence;

	private byte children;

	@Column(name="exp_level")
	private double expLevel;

	@Column(name="hour_price")
	private double hourPrice;

	

	private byte psc1;

	private byte smoker;

	//bi-directional many-to-one association to ProfessionnalCategory
	@ManyToOne
	@JoinColumn(name="idprofessionnal_category")
	private ProfessionnalCategory professionnalCategory1;

	//bi-directional many-to-one association to Person
	@ManyToOne
	private Person person;

	//bi-directional many-to-one association to ProfessionnalCategory
	@ManyToOne
	@JoinColumn(name="professionnal_category_id")
	private ProfessionnalCategory professionnalCategory2;

	public ProfessionnalList() {
	}

	public int getIdProfessionnalList() {
		return this.idProfessionnalList;
	}

	public void setIdProfessionnalList(int idProfessionnalList) {
		this.idProfessionnalList = idProfessionnalList;
	}

	public byte getCarLicence() {
		return this.carLicence;
	}

	public void setCarLicence(byte carLicence) {
		this.carLicence = carLicence;
	}

	public byte getChildren() {
		return this.children;
	}

	public void setChildren(byte children) {
		this.children = children;
	}

	public double getExpLevel() {
		return this.expLevel;
	}

	public void setExpLevel(double expLevel) {
		this.expLevel = expLevel;
	}

	public double getHourPrice() {
		return this.hourPrice;
	}

	public void setHourPrice(double hourPrice) {
		this.hourPrice = hourPrice;
	}

	

	public byte getPsc1() {
		return this.psc1;
	}

	public void setPsc1(byte psc1) {
		this.psc1 = psc1;
	}

	public byte getSmoker() {
		return this.smoker;
	}

	public void setSmoker(byte smoker) {
		this.smoker = smoker;
	}

	public ProfessionnalCategory getProfessionnalCategory1() {
		return this.professionnalCategory1;
	}

	public void setProfessionnalCategory1(ProfessionnalCategory professionnalCategory1) {
		this.professionnalCategory1 = professionnalCategory1;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public ProfessionnalCategory getProfessionnalCategory2() {
		return this.professionnalCategory2;
	}

	public void setProfessionnalCategory2(ProfessionnalCategory professionnalCategory2) {
		this.professionnalCategory2 = professionnalCategory2;
	}

}