package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.entities.ZipCode;

public interface ZipCodeRepository extends JpaRepository<ZipCode, String> {

}
