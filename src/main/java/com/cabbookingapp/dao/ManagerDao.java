package com.cabbookingapp.dao;

import java.util.List;

import com.cabbookingapp.model.Manager;

public interface ManagerDao {
	void insertManager(Manager manager);

	Manager findManager(int managerId);

	void deleteManager(int managerId);

	void updatePassword(String password, int managerId);

	List<Manager> findAllManager();

	int managerLogin(int managerId, String managerPassword) throws Exception;
}
