package be.bt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.repository.ProfesionalListRepository;
import be.bt.services.IPersonService;
import be.bt.services.IProfesionalListService;

@Controller
public class ProfilController {
	
	@Autowired
	IProfesionalListService profesionalListService;
	
	@Autowired
	IPersonService personService;
	
	
	@RequestMapping(value = "/showProfil", method = RequestMethod.GET)
	public String home(Model model, @RequestParam (value="user") String username) {	
		
	
		Person person = personService.findByUser(username);
		
		if (!person.isProfilCompleted()){
			System.out.println("Profil non complet");
			
			return "addProfil";
		}		
		
		ProfessionnalList professional = profesionalListService.findByPerson(person);
		
		model.addAttribute("professional",professional );
		model.addAttribute("person", person);
								
		return "showProfil";
		
	}
	
	@RequestMapping(value = "/addProfil", method = RequestMethod.GET)
	public String addProfil(Model model, @RequestParam (value="user") String username) {
		
		
		
		
		 
		return "showProfil";
		
	}
	
	
	
	
	
	

}
