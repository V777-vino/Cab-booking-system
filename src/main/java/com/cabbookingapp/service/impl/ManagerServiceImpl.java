package com.cabbookingapp.service.impl;

import com.cabbookingapp.dao.ManagerDao;
import com.cabbookingapp.dao.impl.ManagerDaoImpl;
import com.cabbookingapp.model.Manager;
import com.cabbookingapp.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
	public void insertManagerValidate(Manager manager) {
		int isManagerNameValid = managerNameValidate(manager.getManagerName());
		int isManagerEmailvalid = managerEmailValidate(manager.getManagerEmail());
		int isManagerPwordValid = managerPwordValidate(manager.getManagerPassword());

		if (isManagerNameValid + isManagerEmailvalid + isManagerPwordValid == 3) {
			ManagerDao md = new ManagerDaoImpl();
			md.insertManager(manager);
		} else {
			System.err.println("Please re enter Manager details");
		}
	}

	private int managerPwordValidate(String managerPassword) {
		if (managerPassword.length() < 8) {
			System.err.println("Password length must contain eight characters");
		} else {
			return 1;
		}
		return 0;
	}

	private int managerEmailValidate(String managerEmail) {
		if (!managerEmail.contains("@gmail.com")) {
			System.err.println("Enter a valid email id");
		} else {
			return 1;
		}
		return 0;
	}

	private int managerNameValidate(String managerName) {
		if (managerName.isBlank() || managerName.isEmpty()) {
			System.err.println("The manager name should be empty");
		} else {
			return 1;
		}
		return 0;
	}

	public void findManagerValidate(Manager manager) {
		if (manager.getManagerId() < 0) {
			System.err.println("Manager id should not be negative");
		} else {
			Manager.printObject(manager);
		}
	}

	public void deleteManagerValidate(int managerId) {
		int isManagerId = managerIdValidate(managerId);
		if (isManagerId == 1) {
			ManagerDao md = new ManagerDaoImpl();
			md.deleteManager(isManagerId);
		}
	}

	private int managerIdValidate(int managerId) {
		if (managerId < 0) {
			System.err.println("Manager id should not be negative");
		} else {
			return 1;
		}
		return 0;
	}

	public void updateManagerValidate(String password, int managerId) {
		int isPword = managerPwordValidate(password);
		int isManagerId = managerIdValidate(managerId);
		if (isPword + isManagerId == 2) {
			ManagerDao md = new ManagerDaoImpl();
			md.updatePassword(password, managerId);
		}
	}
}
