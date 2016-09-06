package be.bt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.repository.ProfesionalListRepository;
import be.bt.services.IPersonService;
import be.bt.services.IProfesionalListService;
import be.bt.utilities.ProfPersonWrapper;

@Controller
public class ProfilController {
	
	@Autowired
	IProfesionalListService profesionalListService;
	
	@Autowired
	IPersonService personService;
	
	
	@RequestMapping(value = "/showProfil", method = RequestMethod.GET)
	public String home(ModelMap modelMap, @RequestParam (value="user") String username) {	
		
	
		Person person = personService.findByUser(username);
		ProfessionnalList professional = profesionalListService.findByPerson(person);
		
	System.out.println(	professional.getIdProfessionnalList());
		
		ProfPersonWrapper profPerson = new ProfPersonWrapper();
		profPerson.setPerson(person);
		profPerson.setProfessional(professional);
		System.out.println(profPerson.getProfessional().getIdProfessionnalList());
		
		modelMap.addAttribute("profilForm",profPerson );
		
		if (!person.isProfilCompleted()){
			System.out.println("Profil non complet");
			
			return "addProfProfil";
		}		
		
	//	ProfessionnalList professional = profesionalListService.findByPerson(person);
								
		return "showProfil";
		
	}
	
	@RequestMapping(value = "/addProfProfil", method = RequestMethod.GET)
	public String addProfProfil(Model model, @ModelAttribute ("profilForm") ProfPersonWrapper profPerson, 
			BindingResult bindingRuselt) {
		System.out.println("entree dans addprofil");
		System.out.println(profPerson.getProfessional().getIdProfessionnalList());
		ProfessionnalList professional = profPerson.getProfessional();
		
		System.out.println(profPerson.getPerson().getId());
				
		professional.setPerson(profPerson.getPerson());
		profesionalListService.update(professional);
		System.out.println("Fin de addprofil");
		return "home";
		
	}
	
	
}
