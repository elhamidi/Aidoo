package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.bt.entities.ProfessionnalCategory;


@Repository
public interface ProfesionalCategoryRepository extends JpaRepository<ProfessionnalCategory, Integer> {
	
	ProfessionnalCategory getProfesionalCategoryByProfessionnalTitle(String profesionalTitle);

}
