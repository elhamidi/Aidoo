package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.entities.CategoryAnnounce;

public interface CategoryAnnounceRepository extends JpaRepository<CategoryAnnounce, Integer> {
	
	
	CategoryAnnounce findByName(String name);

}
