package be.bt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;
import be.bt.repository.ProfesionalListRepository;

@Service
public class ProfesionalListServiceImp implements IProfesionalListService {
	
	@Autowired 
	private ProfesionalListRepository profesionalListRepository;

	@Override
	public ProfessionnalList persist(ProfessionnalList profesional) {
		// TODO Auto-generated method stub
		return profesionalListRepository.save(profesional);
	}

	@Override
	public ProfessionnalList findByPerson(Person p) {
		// TODO Auto-generated method stub
		return profesionalListRepository.findByPerson(p);
	}
	
	public ProfessionnalList update(ProfessionnalList professional){
		
		profesionalListRepository.save(professional);
		return professional;
		
	}

}
