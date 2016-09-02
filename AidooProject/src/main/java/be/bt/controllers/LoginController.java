package be.bt.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import be.bt.services.ICategoryAnnounceService;
import be.bt.services.IZipCodeService;


@Controller
public class LoginController {
	
	@Autowired
	IZipCodeService zipCodeService;
	

	@Autowired
	ICategoryAnnounceService categoryAnnounceService;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView  login(
			
			@RequestParam(value = "error", required = false) String error
			
			) {
		
		ModelAndView model = new ModelAndView();
		
		if (error != null) {
			model.addObject("error"," Login ou mot de passe incorrect, veuillez réessayer svp! ");
		}

		
		model.setViewName("login1");

		return model;

		
	}
	
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public ModelAndView logout (HttpServletRequest request, HttpServletResponse response) {
	    
		ModelAndView model = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    request.setAttribute("zipcodes", zipCodeService.findAllZipCodes());
	    request.setAttribute("categories" , categoryAnnounceService.findAll());
	 
	    
	    model.setViewName("homePage");
	  return model;
	}

}
