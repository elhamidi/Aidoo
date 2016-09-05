package be.bt.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import be.bt.entities.MyUser;
import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.entities.UserRole;
import be.bt.repository.ProfesionalListRepository;
import be.bt.services.ICategoryAnnounceService;
import be.bt.services.IPersonService;
import be.bt.services.IProfesionalCategoryService;
import be.bt.services.IProfesionalListService;
import be.bt.services.IRoleService;
import be.bt.services.IUserService;
import be.bt.services.IZipCodeService;
import be.bt.utilities.UserPersonWrapper;

@Controller
public class RegistrationController {

	@Autowired
	IPersonService personService;

	@Autowired
	IZipCodeService zipCodeService;

	@Autowired
	IProfesionalCategoryService profesionalCategoryService;

	@Autowired
	IProfesionalListService profesionalListService;

	@Autowired
	ICategoryAnnounceService categoryAnnounceService;

	@Autowired
	IRoleService roleService;

	@Autowired
	IUserService userService;

	// @Autowired
	// protected UserDetailsManager userDetailsManager;

	// @Autowired
	// @Qualifier("authMgr")
	// private AuthenticationManager authMgr;
	@Autowired
	private UserDetailsService userDetailsSvc;

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@RequestMapping(value = { "/preRegistration" }, method = RequestMethod.GET)
	public String preRegister(Model model) {

		return "preRegistration";
	}

	@RequestMapping(value = { "/registration" }, method = RequestMethod.GET)
	public String showForm(Model model, HttpServletRequest request) {

		String category = request.getParameter("categorie");

		Person person = new Person();
		MyUser user = new MyUser();
		model.addAttribute("zipcodes", zipCodeService.findAllZipCodes());

		UserPersonWrapper combinedObject = new UserPersonWrapper();
		combinedObject.setPerson(person);
		combinedObject.setUser(user);
		model.addAttribute("userForm", combinedObject);
		model.addAttribute("categorie", category);

		return "registration";
	}

	@RequestMapping(value = { "/postRegistration" }, method = RequestMethod.POST)
	public String saveUser(Model model, @ModelAttribute("userForm") @Valid UserPersonWrapper combinedObject, 
			@RequestParam (value="zipcode") int zipId,
			BindingResult bindingRuselt, HttpServletRequest request) {

		if (bindingRuselt.hasErrors()) {
			return "registration";
		}
		
		

		String category = request.getParameter("categorie");

		System.out.println(" =============="+ zipId);

		model.addAttribute("zipcodes", zipCodeService.findAllZipCodes());
		model.addAttribute("categories", categoryAnnounceService.findAll());
		System.out.println(" ================="+ zipCodeService.getZipCodeByZipCode(zipId));
		
		MyUser user = combinedObject.getUser();
		Person person = combinedObject.getPerson();
		
	
		person.setZipCode(zipCodeService.getZipCodeByZipCode(zipId));
		
		System.out.println(" ================="+ zipCodeService.getZipCodeByZipCode(zipId));
	
		
		System.out.println(person.getFirstName());

		// user.setEnabled(new Byte("1"));
		UserRole userRole = new UserRole();
		
		userRole.setUser(user);

		user.setUserRoles(new ArrayList<UserRole>());
		user.getUserRoles().add(userRole);

		person.setUser(user);
		
		
		// Si le user est un proffesionnel on enregistre parsonne et prossiolaList

		if (!category.equals("customer")) {
			userRole.setRole("ROLE_babysitter");
			ProfessionnalList profesional = new ProfessionnalList();
			profesional.setPerson(person);

			profesional.setProfessionnalCategory(profesionalCategoryService.getProfesionalCategoryByName(category));
			profesionalListService.persist(profesional);
			
			//userService.persistUserAndPersonAndProfesional(user, person, profesional);

			
		}
		
		// sinon on enregistre la personne

		else {
			userRole.setRole("ROLE_customer");

			userService.persistUserAndPerson(user, person);
		}

		roleService.saveRole(userRole);

		// If category equals "baby-sitter" Create the ProfesiolaList Object and
		// Save it in DB

		/* Enregistrer le Role */

		// Create the authorities for the user
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("babysitter")); // Autorité
																	// assignée
																	// par
																	// défaut

		// Instantiate the user (with a class implementing UserDetails)

		// PasswordEncoder passwordEncoder = new P;
		UserDetails authentifiedUser = new User(user.getUsername(), user.getPassword(), authorities);

		// Save the user somewhere useful. The JdbcUserDetailsManager can save a
		// user to a database easily.
		// userDetailsManager.createUser(authentifiedUser);

		// Create a UsernamePasswordAuthenticationToken
		Authentication authentication = new UsernamePasswordAuthenticationToken(authentifiedUser, user.getPassword(),
				authorities);

		// authenticationManager.authenticate(authentication);

		// Add the Authentication to the SecurityContext
		SecurityContextHolder.getContext().setAuthentication(authentication);

		request.getSession().setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,
				SecurityContextHolder.getContext());
		//

		return "homePage";

	}

}
