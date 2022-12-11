package com.cabbookingapp.dao;

import java.util.List;

import com.cabbookingapp.model.Cab;

public interface CabDao {

	void insertCab(Cab cab);

	void deleteCab(int cabNumber);

	List<Cab> findAllCab();

	Cab findCab(int cabNumber);
}
