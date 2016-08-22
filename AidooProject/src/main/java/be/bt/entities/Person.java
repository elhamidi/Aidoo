package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p JOIN FETCH p.announces")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="account_number")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="date_birth")
	private Date dateBirth;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="login_id")
	private int loginId;

	private String mobile;

	@Column(name="`nis number`")
	private String nis_number;

	private String num;

	@Column(name="password_user")
	private String passwordUser;

	@Column(name="phone_number")
	private String phoneNumber;

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

	//bi-directional many-to-one association to MsgDisc
	@OneToMany(mappedBy="person1")
	private List<MsgDisc> msgDiscs1;

	//bi-directional many-to-one association to MsgDisc
	@OneToMany(mappedBy="person2")
	private List<MsgDisc> msgDiscs2;

	//bi-directional many-to-one association to CatProbleme
	@ManyToOne
	@JoinColumn(name="cat_problemes_id")
	private CatProbleme catProbleme;

	//bi-directional many-to-one association to ListCountry
	@ManyToOne
	@JoinColumn(name="list_country_id")
	private ListCountry listCountry;

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

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNis_number() {
		return this.nis_number;
	}

	public void setNis_number(String nis_number) {
		this.nis_number = nis_number;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPasswordUser() {
		return this.passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public List<MsgDisc> getMsgDiscs1() {
		return this.msgDiscs1;
	}

	public void setMsgDiscs1(List<MsgDisc> msgDiscs1) {
		this.msgDiscs1 = msgDiscs1;
	}

	public MsgDisc addMsgDiscs1(MsgDisc msgDiscs1) {
		getMsgDiscs1().add(msgDiscs1);
		msgDiscs1.setPerson1(this);

		return msgDiscs1;
	}

	public MsgDisc removeMsgDiscs1(MsgDisc msgDiscs1) {
		getMsgDiscs1().remove(msgDiscs1);
		msgDiscs1.setPerson1(null);

		return msgDiscs1;
	}

	public List<MsgDisc> getMsgDiscs2() {
		return this.msgDiscs2;
	}

	public void setMsgDiscs2(List<MsgDisc> msgDiscs2) {
		this.msgDiscs2 = msgDiscs2;
	}

	public MsgDisc addMsgDiscs2(MsgDisc msgDiscs2) {
		getMsgDiscs2().add(msgDiscs2);
		msgDiscs2.setPerson2(this);

		return msgDiscs2;
	}

	public MsgDisc removeMsgDiscs2(MsgDisc msgDiscs2) {
		getMsgDiscs2().remove(msgDiscs2);
		msgDiscs2.setPerson2(null);

		return msgDiscs2;
	}

	public CatProbleme getCatProbleme() {
		return this.catProbleme;
	}

	public void setCatProbleme(CatProbleme catProbleme) {
		this.catProbleme = catProbleme;
	}

	public ListCountry getListCountry() {
		return this.listCountry;
	}

	public void setListCountry(ListCountry listCountry) {
		this.listCountry = listCountry;
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