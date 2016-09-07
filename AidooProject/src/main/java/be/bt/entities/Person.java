package be.bt.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="account_number")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="date_birth")
	private Date dateBirth;

	private String email;

	@Column(name="first_name")
	@Size(min=2, max=30, message="Le Nom doit etre entre 2 et 30 caractéres")
	private String firstName;

	@Column(name="last_name")
	@Size(min=2, max=30, message="Le Nom doit etre entre 2 et 30 caractéres")
	private String lastName;

	private String mobile;

	@Column(name="nis_number")
	private String nisNumber;

	private String num;

	@Column(name="phone_number")
	private String phoneNumber;

	private String picture;

	@Column(name="pos_latitude")
	private float posLatitude;

	@Column(name="pos_longitude")
	private float posLongitude;

	private byte sex;

	private String street;

	//bi-directional many-to-one association to Announce
	@OneToMany(mappedBy="person")
	private List<Announce> announces;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="person1")
	private List<Comment> comments1;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="person2")
	private List<Comment> comments2;

	//bi-directional many-to-one association to Dispo
	@OneToMany(mappedBy="person")
	private List<Dispo> dispos;

	//bi-directional many-to-one association to FrequencyDispo
	@OneToMany(mappedBy="person")
	private List<FrequencyDispo> frequencyDispos;

	//bi-directional many-to-one association to MyUser
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="username")
	private MyUser user;

	//bi-directional many-to-one association to ZipCode
	@ManyToOne
	@JoinColumn(name="zip_code_id")
	private ZipCode zipCode;

	//bi-directional many-to-one association to PersonHasLanguage
	@OneToMany(mappedBy="person")
	private List<PersonHasLanguage> personHasLanguages;

	//bi-directional many-to-one association to ProfessionnalList
	@OneToMany(mappedBy="person")
	private List<ProfessionnalList> professionnalLists;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="person")
	private List<Task> tasks;
	
	private boolean profilCompleted = false;
	

	/**
	 * @return the profilCompleted
	 */
	public boolean isProfilCompleted() {
		return profilCompleted;
	}

	/**
	 * @param profilCompleted the profilCompleted to set
	 */
	public void setProfilCompleted(boolean profilCompleted) {
		this.profilCompleted = profilCompleted;
	}

	public Person() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateBirth() {
		return this.dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNisNumber() {
		return this.nisNumber;
	}

	public void setNisNumber(String nisNumber) {
		this.nisNumber = nisNumber;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public float getPosLatitude() {
		return this.posLatitude;
	}

	public void setPosLatitude(float posLatitude) {
		this.posLatitude = posLatitude;
	}

	public float getPosLongitude() {
		return this.posLongitude;
	}

	public void setPosLongitude(float posLongitude) {
		this.posLongitude = posLongitude;
	}

	public byte getSex() {
		return this.sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public List<Announce> getAnnounces() {
		return this.announces;
	}

	public void setAnnounces(List<Announce> announces) {
		this.announces = announces;
	}

	public Announce addAnnounce(Announce announce) {
		getAnnounces().add(announce);
		announce.setPerson(this);

		return announce;
	}

	public Announce removeAnnounce(Announce announce) {
		getAnnounces().remove(announce);
		announce.setPerson(null);

		return announce;
	}

	public List<Comment> getComments1() {
		return this.comments1;
	}

	public void setComments1(List<Comment> comments1) {
		this.comments1 = comments1;
	}

	public Comment addComments1(Comment comments1) {
		getComments1().add(comments1);
		comments1.setPerson1(this);

		return comments1;
	}

	public Comment removeComments1(Comment comments1) {
		getComments1().remove(comments1);
		comments1.setPerson1(null);

		return comments1;
	}

	public List<Comment> getComments2() {
		return this.comments2;
	}

	public void setComments2(List<Comment> comments2) {
		this.comments2 = comments2;
	}

	public Comment addComments2(Comment comments2) {
		getComments2().add(comments2);
		comments2.setPerson2(this);

		return comments2;
	}

	public Comment removeComments2(Comment comments2) {
		getComments2().remove(comments2);
		comments2.setPerson2(null);

		return comments2;
	}

	public List<Dispo> getDispos() {
		return this.dispos;
	}

	public void setDispos(List<Dispo> dispos) {
		this.dispos = dispos;
	}

	public Dispo addDispo(Dispo dispo) {
		getDispos().add(dispo);
		dispo.setPerson(this);

		return dispo;
	}

	public Dispo removeDispo(Dispo dispo) {
		getDispos().remove(dispo);
		dispo.setPerson(null);

		return dispo;
	}

	public List<FrequencyDispo> getFrequencyDispos() {
		return this.frequencyDispos;
	}

	public void setFrequencyDispos(List<FrequencyDispo> frequencyDispos) {
		this.frequencyDispos = frequencyDispos;
	}

	public FrequencyDispo addFrequencyDispo(FrequencyDispo frequencyDispo) {
		getFrequencyDispos().add(frequencyDispo);
		frequencyDispo.setPerson(this);

		return frequencyDispo;
	}

	public FrequencyDispo removeFrequencyDispo(FrequencyDispo frequencyDispo) {
		getFrequencyDispos().remove(frequencyDispo);
		frequencyDispo.setPerson(null);

		return frequencyDispo;
	}

	public MyUser getUser() {
		return this.user;
	}

	public void setUser(MyUser user) {
		this.user = user;
	}

	public ZipCode getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}

	public List<PersonHasLanguage> getPersonHasLanguages() {
		return this.personHasLanguages;
	}

	public void setPersonHasLanguages(List<PersonHasLanguage> personHasLanguages) {
		this.personHasLanguages = personHasLanguages;
	}

	public PersonHasLanguage addPersonHasLanguage(PersonHasLanguage personHasLanguage) {
		getPersonHasLanguages().add(personHasLanguage);
		personHasLanguage.setPerson(this);

		return personHasLanguage;
	}

	public PersonHasLanguage removePersonHasLanguage(PersonHasLanguage personHasLanguage) {
		getPersonHasLanguages().remove(personHasLanguage);
		personHasLanguage.setPerson(null);

		return personHasLanguage;
	}

	public List<ProfessionnalList> getProfessionnalLists() {
		return this.professionnalLists;
	}

	public void setProfessionnalLists(List<ProfessionnalList> professionnalLists) {
		this.professionnalLists = professionnalLists;
	}

	public ProfessionnalList addProfessionnalList(ProfessionnalList professionnalList) {
		getProfessionnalLists().add(professionnalList);
		professionnalList.setPerson(this);

		return professionnalList;
	}

	public ProfessionnalList removeProfessionnalList(ProfessionnalList professionnalList) {
		getProfessionnalLists().remove(professionnalList);
		professionnalList.setPerson(null);

		return professionnalList;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setPerson(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setPerson(null);

		return task;
	}

}