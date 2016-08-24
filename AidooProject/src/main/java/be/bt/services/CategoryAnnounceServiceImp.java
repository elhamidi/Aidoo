package be.bt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.CategoryAnnounce;
import be.bt.repository.CategoryAnnounceRepository;


@Service
public class CategoryAnnounceServiceImp implements ICategoryAnnounceService {

	@Autowired
	CategoryAnnounceRepository categoryAnnounceRepository;
	
	@Override
	public List<CategoryAnnounce> findAll() {
		
		return categoryAnnounceRepository.findAll();
	}

}
