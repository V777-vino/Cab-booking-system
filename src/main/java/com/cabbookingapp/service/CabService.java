package com.cabbookingapp.service;

import com.cabbookingapp.model.Cab;

public interface CabService {
	void insertCabValidate(Cab cab);

	void deleteCabValidate(int cabNumber);

	void findCabValidate(Cab cab);
	

}
