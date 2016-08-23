package be.bt.services;

import java.util.List;

import be.bt.entities.Announce;

public interface IAnnounceService {
	
	List<Announce> findAllAnnouces();
	Announce findAnnouceById(String Id);
	List<Announce> findAnnounceByCategory(String categoryId);
	List<Announce> findAnnounceByPerson(int PersonId);
	
	List<Announce> findAnnoucesByZipCode(String zipCode);
	List<Announce> findAnnoucesByZipCodeAndCategory(String zipCode, String catName);

}
