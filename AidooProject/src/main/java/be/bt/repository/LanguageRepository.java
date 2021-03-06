package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.bt.entities.Language;


@Repository
public interface LanguageRepository extends JpaRepository<Language, String> {

}
