package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.entities.MyUser;


public interface UserRepository extends JpaRepository<MyUser, Integer> {

}
