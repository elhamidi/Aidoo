package be.bt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import be.bt.entities.Announce;

@Repository
public interface AnnounceRepository extends JpaRepository<Announce, String> {
	
	@Query("FROM Announce a JOIN FETCH a.person join fetch a.person.listCountry")
	List<Announce> findAllAnnounces();
	
	
	@Query ("FROM Announce a JOIN FETCH a.person JOIN FETCH a.categoryAnnounce where a.categoryAnnounce= :categoryannounce ")
	List<Announce> findAnnounceByCategory(@Param ("categoryannounce")String category);
	
	
	@Query ("FROM Announce a  JOIN FETCH a.person JOIN FETCH a.categoryAnnounce where a.person.zipCode.zipCode = :zip ")
	List<Announce> findAnnoucesByZipCode(@Param ("zip") String zipcode);
	
	
	@Query ("FROM Announce a  JOIN FETCH a.person JOIN FETCH a.categoryAnnounce where a.person.zipCode.zipCode = :zip  AND a.categoryAnnounce.name=: catName")
	List<Announce> findAnnoucesByZipCodeAndCategory(@Param ("zip") String zipcode,
			@Param ("catName") String catName);
	
	

}
