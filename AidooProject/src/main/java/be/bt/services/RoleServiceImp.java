package be.bt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.UserRole;
import be.bt.repository.RoleRepository;



@Service
public class RoleServiceImp implements IRoleService {
	

	@Autowired private RoleRepository roleRepository;

	@Override
	public List<UserRole> getRoleByName(String username) {
		
		return roleRepository.getRoleByUser(username);
	}
	
}
