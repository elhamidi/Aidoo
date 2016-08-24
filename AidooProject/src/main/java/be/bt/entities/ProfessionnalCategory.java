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
	@OneToMany(mappedBy="professionnalCategory1")
	private List<ProfessionnalList> professionnalLists1;

	//bi-directional many-to-one association to ProfessionnalList
	@OneToMany(mappedBy="professionnalCategory2")
	private List<ProfessionnalList> professionnalLists2;

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

	public List<ProfessionnalList> getProfessionnalLists1() {
		return this.professionnalLists1;
	}

	public void setProfessionnalLists1(List<ProfessionnalList> professionnalLists1) {
		this.professionnalLists1 = professionnalLists1;
	}

	public ProfessionnalList addProfessionnalLists1(ProfessionnalList professionnalLists1) {
		getProfessionnalLists1().add(professionnalLists1);
		professionnalLists1.setProfessionnalCategory1(this);

		return professionnalLists1;
	}

	public ProfessionnalList removeProfessionnalLists1(ProfessionnalList professionnalLists1) {
		getProfessionnalLists1().remove(professionnalLists1);
		professionnalLists1.setProfessionnalCategory1(null);

		return professionnalLists1;
	}

	public List<ProfessionnalList> getProfessionnalLists2() {
		return this.professionnalLists2;
	}

	public void setProfessionnalLists2(List<ProfessionnalList> professionnalLists2) {
		this.professionnalLists2 = professionnalLists2;
	}

	public ProfessionnalList addProfessionnalLists2(ProfessionnalList professionnalLists2) {
		getProfessionnalLists2().add(professionnalLists2);
		professionnalLists2.setProfessionnalCategory2(this);

		return professionnalLists2;
	}

	public ProfessionnalList removeProfessionnalLists2(ProfessionnalList professionnalLists2) {
		getProfessionnalLists2().remove(professionnalLists2);
		professionnalLists2.setProfessionnalCategory2(null);

		return professionnalLists2;
	}

}