package be.bt.services;

import java.util.List;

import be.bt.entities.UserRole;

public interface IRoleService {
	
	List<UserRole> getRoleByName(String role);
	
	UserRole saveRole(UserRole userRole);

}
