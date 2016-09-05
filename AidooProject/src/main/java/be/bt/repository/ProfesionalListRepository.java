package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;

@Repository
public interface ProfesionalListRepository extends JpaRepository<ProfessionnalList, Integer> {
	
	
	ProfessionnalList findByPerson (Person p);

}
