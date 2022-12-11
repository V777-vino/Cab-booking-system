package com.cabbookingapp.service;

import com.cabbookingapp.model.Manager;

public interface ManagerService {
	void insertManagerValidate(Manager manager);

	void findManagerValidate(Manager manager);

	void deleteManagerValidate(int managerId);

	void updateManagerValidate(String password, int managerId);

}
