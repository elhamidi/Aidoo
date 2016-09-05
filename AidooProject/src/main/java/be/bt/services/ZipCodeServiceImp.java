package be.bt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.ZipCode;
import be.bt.repository.ZipCodeRepository;

@Service
public class ZipCodeServiceImp implements IZipCodeService {
	
	@Autowired
	ZipCodeRepository zipCodeRepository;

	@Override
	public List<ZipCode> findAllZipCodes() {
		// TODO Auto-generated method stub
		return zipCodeRepository.findAll();
	}

	@Override
	public ZipCode getZipCodeByZipCode(int zipId) {
		// TODO Auto-generated method stub
		return zipCodeRepository.findOne(zipId);
	}

}
