package be.bt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import be.bt.entities.UserRole;

@Repository
public interface RoleRepository extends JpaRepository<UserRole, Integer> {
	
	
	@Query("SELECT role  FROM UserRole u WHERE u.user = :username ")
	List<UserRole> getRoleByUser(@Param ("username") String username);
	

}
