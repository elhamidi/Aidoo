package be.bt.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.bt.repository.AnnounceRepository;
import be.bt.repository.LanguageRepository;
import be.bt.repository.PersonRepository;
import be.bt.services.IZipCodeService;
import be.bt.utilities.GeoUtil;

/**
 * Handles requests for the application home page.
 */ 
@Controller
public class HomeController {

//	@Autowired
//	PersonRepository personRepository;
//
//	@Autowired
//	AnnounceRepository announceRepository;
	
//	
	@Autowired
	IZipCodeService zipCodeService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println(GeoUtil.distFrom(50.887070, 4.339163, 35.529072, -5.748394));

		//model.addAttribute("zipcodes", zipCodeService.findAllZipCodes());
				
		return "homeBoot";
		
		
	}

}
