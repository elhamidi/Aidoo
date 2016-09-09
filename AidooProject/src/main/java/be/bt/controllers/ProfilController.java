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
	public String home(ModelMap modelMap, @RequestParam (value="user") String username) {	
		
		modelMap.addAttribute("zipcodes", zipCodeService.findAllZipCodes());// a deplacer
		Person person = personService.findByUser(username);
		ProfessionnalList professional = profesionalListService.findByPerson(person);

		List<Announce> annonces = person.getAnnounces();
		
		ProfPersonWrapper profPerson = new ProfPersonWrapper();
		profPerson.setUser(person.getUser());
		profPerson.setZipCode(person.getZipCode());
	
		profPerson.setPerson(person);
		profPerson.setProfessional(professional);
		profPerson.setAnnonces(annonces);

	// si pas encore de profil
		
		if (!person.isProfilCompleted()){
			System.out.println("Profil non complet");
			
			Announce nouvelleAnnonce = new Announce();
			CategoryAnnounce categorie = categorieAnnounceService.findByName("Offre Baby-sitter");
			profPerson.setNouvelleAnnonce(nouvelleAnnonce);
			profPerson.setCategorieAnnonce(categorie);
			
			modelMap.addAttribute("profilForm",profPerson );
			
			return "profilAdd";
		}		
		
	//	ProfessionnalList professional = profesionalListService.findByPerson(person);
		
		// si profil existant
		
		modelMap.addAttribute("profilForm",profPerson );
				
		return "showProfProfil";
		
	}
		
	@RequestMapping(value = "/addProfProfil", method = RequestMethod.GET)
	public String addProfProfil(Model model, 
								@ModelAttribute ("profilForm") ProfPersonWrapper profPerson, 
								BindingResult bindingRuselt) {
		
		System.out.println("entree dans addprofil");
		System.out.println(profPerson.getProfessional().getIdProfessionnalList());
		
		ProfessionnalList professional = profPerson.getProfessional();
		Person person = profPerson.getPerson(); 
		Announce nouvelleAnnonce= profPerson.getNouvelleAnnonce();
		
		
		
	//	System.out.println(profPerson.getPerson().getId());
		
		person.setUser(profPerson.getUser());
		person.setZipCode(profPerson.getZipCode());
		
				
		professional.setPerson(person);
		System.out.println(profPerson.getUser().getUsername());
		
		person.setProfilCompleted(true);
		personService.save(person);
		
		profesionalListService.update(professional);
		
		nouvelleAnnonce.setCategoryAnnounce(profPerson.getCategorieAnnonce());
		nouvelleAnnonce.setDateCreation(new Date());
		nouvelleAnnonce.setPerson(person);
		
		annonceService.save(nouvelleAnnonce);
		
		

	//	System.out.println(profPerson.getPerson().getUser().getUsername());
		
		
		
		
		
		System.out.println("Fin de addprofil");
		return "homePage";
		
	}
	
	
}
