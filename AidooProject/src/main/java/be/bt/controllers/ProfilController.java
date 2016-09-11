package be.bt.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionCacheOptimizer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.bt.entities.Announce;
import be.bt.entities.CategoryAnnounce;
import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.repository.ProfesionalListRepository;
import be.bt.services.CategoryAnnounceServiceImp;
import be.bt.services.IAnnounceService;
import be.bt.services.ICategoryAnnounceService;
import be.bt.services.IPersonService;
import be.bt.services.IProfesionalListService;
import be.bt.services.IRoleService;
import be.bt.services.IUserService;
import be.bt.services.IZipCodeService;
import be.bt.utilities.ProfPersonWrapper;

@Controller
public class ProfilController {

	@Autowired
	IProfesionalListService profesionalListService;

	@Autowired
	IPersonService personService;

	@Autowired
	IZipCodeService zipCodeService;

	@Autowired
	IAnnounceService annonceService;

	@Autowired
	ICategoryAnnounceService categorieAnnounceService;

	@Autowired
	IUserService userService;

	@RequestMapping(value = "/showProfil", method = RequestMethod.GET)
	public String home(ModelMap modelMap, @RequestParam(value = "user") String username) {

		boolean isProfessionnal = true;
		CategoryAnnounce categorie =null;

		modelMap.addAttribute("zipcodes", zipCodeService.findAllZipCodes());
		Person person = personService.findByUser(username);
		ProfessionnalList professional = profesionalListService.findByPerson(person);

		if (professional == null) {
			isProfessionnal = false;

		}

		List<Announce> annonces = annonceService.findAnnounceByPerson(person);

		ProfPersonWrapper profPerson = new ProfPersonWrapper();
		profPerson.setUser(person.getUser());
		profPerson.setZipCode(person.getZipCode());

		profPerson.setPerson(person);
		profPerson.setProfessional(professional);
		profPerson.setAnnonces(annonces);

		// si pas encore de profil

		if (!person.isProfilCompleted()) {
			System.out.println("Profil non complet");

			Announce nouvelleAnnonce = new Announce();
			if (!isProfessionnal) {
				 categorie = categorieAnnounceService.findByName("Demande Baby-sitter");
			} else {
				 categorie = categorieAnnounceService.findByName("Offre Baby-sitter");
			}
			profPerson.setNouvelleAnnonce(nouvelleAnnonce);
			profPerson.setCategorieAnnonce(categorie);

			modelMap.addAttribute("profilForm", profPerson);
			
			if (!isProfessionnal){
				return "addCmrProfil";
			}

			return "profilAdd";
		}

		// ProfessionnalList professional =
		// profesionalListService.findByPerson(person);

		// si profil existant

		modelMap.addAttribute("profilForm", profPerson);
		
		if (!isProfessionnal)
		{
			return "showCmrProfil";
		}

		return "showProfProfil";

	}

	@RequestMapping(value = "/addProfProfil", method = RequestMethod.GET)
	public String addProfProfil(Model model, @ModelAttribute("profilForm") ProfPersonWrapper profPerson,
			BindingResult bindingRuselt) {
		
		boolean isProfessionnal = true;

		System.out.println("entree dans addprofil");
		
		model.addAttribute("zipcodes", zipCodeService.findAllZipCodes());
		

		ProfessionnalList professional = profPerson.getProfessional();
		if (professional == null){
			isProfessionnal = false;
		}
		
		
		Person person = profPerson.getPerson();
		
		System.out.println(person.getLastName());
		Announce nouvelleAnnonce = profPerson.getNouvelleAnnonce();
		
		

		

		person.setUser(profPerson.getUser());
	
		
		System.out.println(profPerson.getZipCode().getZipName());

		
		
	

		person.setProfilCompleted(true);
		personService.save(person);

		if (isProfessionnal){
			professional.setPerson(person);
			profesionalListService.update(professional);
		}
		

		nouvelleAnnonce.setCategoryAnnounce(profPerson.getCategorieAnnonce());
		nouvelleAnnonce.setDateCreation(new Date());
		nouvelleAnnonce.setPerson(person);

		annonceService.save(nouvelleAnnonce);

		// System.out.println(profPerson.getPerson().getUser().getUsername());

		System.out.println("Fin de addprofil");
		
		List<Announce> annonces = annonceService.findAnnounceByPerson(person);
		profPerson.setAnnonces(annonces);
		profPerson.setZipCode(person.getZipCode());
		
	//	model.addAttribute("profPerson",profPerson);
		
		if(!isProfessionnal){
			return "showCmrProfil";
		}
		
		return "showProfProfil";
		

	}

}
