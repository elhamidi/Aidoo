package be.bt.services;

import java.util.List;

import be.bt.entities.ZipCode;

public interface IZipCodeService {
	
	List<ZipCode> findAllZipCodes(); 
	ZipCode getZipCodeByZipCode(int zipcode);

}
