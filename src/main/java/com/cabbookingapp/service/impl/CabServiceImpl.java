package com.cabbookingapp.service.impl;

import com.cabbookingapp.dao.CabDao;
import com.cabbookingapp.dao.impl.CabDaoImpl;
import com.cabbookingapp.model.Cab;
import com.cabbookingapp.service.CabService;

public class CabServiceImpl implements CabService {

	public void insertCabValidate(Cab cab) {
		int isCabNameValid = cabNameValidation(cab.getCabName());
		int isSeateralid = seaterValidation(cab.getSeaters());

		if (isCabNameValid + isSeateralid == 2) {
			CabDao cd = new CabDaoImpl();
			cd.insertCab(cab);
		} else {
			System.err.println("Please re enter cab details!");
		}

	}

	private int seaterValidation(Integer seaters) {
		if (seaters < 0 || seaters > 8) {
			System.err.println("Enter a valid seaters count");
		} else {
			return 1;
		}
		return 0;

	}

	private int cabNameValidation(String cabName) {
		if (cabName.isBlank() || cabName.isEmpty()) {
			System.err.println("Cab name should not be empty");

		} else {
			return 1;
		}
		return 0;
	}

	public void deleteCabValidate(int cabNumber) {
		int isCabNumber = cabNumberValidation(cabNumber);

		if (isCabNumber == 1) {
			CabDao cd = new CabDaoImpl();
			cd.deleteCab(cabNumber);
		}

	}

	private int cabNumberValidation(int cabNumber) {
		if (cabNumber < 0) {
			System.err.println("Cab number should not be zero");
		} else {
			return 1;
		}
		return 0;
	}

	public void findCabValidate(Cab cab) {

		if (cab.getCabNumber() <= 0) {
			System.err.println("Cab number should not be zero");
		} else {
			Cab.printObject(cab);
		}
	}

}
