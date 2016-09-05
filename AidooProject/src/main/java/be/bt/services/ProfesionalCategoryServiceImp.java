package be.bt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.ProfessionnalCategory;
import be.bt.repository.ProfesionalCategoryRepository;

@Service
public class ProfesionalCategoryServiceImp implements IProfesionalCategoryService {
	
	@Autowired
	private ProfesionalCategoryRepository profesionalCategoryRepository;
	@Override
	public ProfessionnalCategory getProfesionalCategoryByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

}
