package be.bt.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import be.bt.entities.Person;
import be.bt.entities.ZipCode;



@Repository
public interface PersonRepository extends JpaRepository<Person, String>{
	
	@Query ("select p from Person p join fetch p.zipCode where p.zipCode.zipName = :zipname ")
	List<Person> findByZipCode(@Param("zipname") String zipeCode);
			
}
