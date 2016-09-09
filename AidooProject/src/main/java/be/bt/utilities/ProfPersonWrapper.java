package be.bt.utilities;

import java.util.List;

import be.bt.entities.Announce;
import be.bt.entities.CategoryAnnounce;
import be.bt.entities.MyUser;
import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.entities.ZipCode;

public class ProfPersonWrapper {

	private ProfessionnalList professional;
	private Person person;
	private MyUser user;
	private ZipCode zipCode;
	private CategoryAnnounce categorieAnnonce;
	/**
	 * @return the categorieAnnonce
	 */
	public CategoryAnnounce getCategorieAnnonce() {
		return categorieAnnonce;
	}
	/**
	 * @param categorieAnnonce the categorieAnnonce to set
	 */
	public void setCategorieAnnonce(CategoryAnnounce categorieAnnonce) {
		this.categorieAnnonce = categorieAnnonce;
	}
	/**
	 * @return the user
	 */
	public MyUser getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(MyUser user) {
		this.user = user;
	}
	/**
	 * @return the zipCode
	 */
	public ZipCode getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}
	private List<Announce> annonces;
	
	private Announce nouvelleAnnonce;
	
	
	
	
	public ProfPersonWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the professional
	 */
	public ProfessionnalList getProfessional() {
		return professional;
	}
	/**
	 * @param professional the professional to set
	 */
	public void setProfessional(ProfessionnalList professional) {
		this.professional = professional;
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	

	/**
	 * @return the nouvelleAnnonce
	 */
	public Announce getNouvelleAnnonce() {
		return nouvelleAnnonce;
	}
	/**
	 * @return the annonces
	 */
	public List<Announce> getAnnonces() {
		return annonces;
	}
	/**
	 * @param annonces the annonces to set
	 */
	public void setAnnonces(List<Announce> annonces) {
		this.annonces = annonces;
	}
	/**
	 * @param nouvelleAnnonce the nouvelleAnnonce to set
	 */
	public void setNouvelleAnnonce(Announce nouvelleAnnonce) {
		this.nouvelleAnnonce = nouvelleAnnonce;
	}
	
	
	
}
