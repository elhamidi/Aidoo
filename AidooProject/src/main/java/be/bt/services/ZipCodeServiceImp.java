package be.bt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.ZipCode;
import be.bt.repository.ZipCodeRepository;

@Service
public class ZipCodeServiceImp implements IZipCodeService {
	
	@Autowired
	ZipCodeRepository ZipCodeRepository;

	@Override
	public List<ZipCode> findAllZipCodes() {
		// TODO Auto-generated method stub
		return ZipCodeRepository.findAll();
	}

}
