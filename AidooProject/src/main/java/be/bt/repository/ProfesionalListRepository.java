package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import be.bt.entities.Person;
import be.bt.entities.ProfessionnalList;

@Repository
public interface ProfesionalListRepository extends JpaRepository<ProfessionnalList, Integer> {
	
	@Query ("Select pr from ProfessionnalList pr join fetch pr.person join fetch pr.person.user "
			+ "join fetch pr.person.zipCode where pr.person= :person")
	ProfessionnalList findByPerson (@Param("person") Person p);

}
