package be.bt.services;

import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;

public interface IProfesionalListService {
	
	ProfessionnalList  persist(ProfessionnalList profesional);
	
	ProfessionnalList findByPerson(Person p);

}
