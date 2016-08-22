package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the professionnal_category database table.
 * 
 */
@Entity
@Table(name="professionnal_category")
@NamedQuery(name="ProfessionnalCategory.findAll", query="SELECT p FROM ProfessionnalCategory p")
public class ProfessionnalCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idprofessionnal_category")
	private int idprofessionnalCategory;

	@Column(name="professionnal_title")
	private String professionnalTitle;

	//bi-directional many-to-one association to ProfessionnalList
	@OneToMany(mappedBy="professionnalCategory")
	private List<ProfessionnalList> professionnalLists;

	public ProfessionnalCategory() {
	}

	public int getIdprofessionnalCategory() {
		return this.idprofessionnalCategory;
	}

	public void setIdprofessionnalCategory(int idprofessionnalCategory) {
		this.idprofessionnalCategory = idprofessionnalCategory;
	}

	public String getProfessionnalTitle() {
		return this.professionnalTitle;
	}

	public void setProfessionnalTitle(String professionnalTitle) {
		this.professionnalTitle = professionnalTitle;
	}

	public List<ProfessionnalList> getProfessionnalLists() {
		return this.professionnalLists;
	}

	public void setProfessionnalLists(List<ProfessionnalList> professionnalLists) {
		this.professionnalLists = professionnalLists;
	}

	public ProfessionnalList addProfessionnalList(ProfessionnalList professionnalList) {
		getProfessionnalLists().add(professionnalList);
		professionnalList.setProfessionnalCategory(this);

		return professionnalList;
	}

	public ProfessionnalList removeProfessionnalList(ProfessionnalList professionnalList) {
		getProfessionnalLists().remove(professionnalList);
		professionnalList.setProfessionnalCategory(null);

		return professionnalList;
	}

}