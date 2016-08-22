package be.bt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import be.bt.entities.Announce;

@Repository
public interface AnnounceRepository extends JpaRepository<Announce, String> {
	
	@Query("FROM Announce a JOIN FETCH a.person join fetch a.person.listCountry")
	List<Announce> findAllAnnounces();

}
