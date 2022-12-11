package com.cabbookingapp.service.impl;

import com.cabbookingapp.dao.EmployeeDao;
import com.cabbookingapp.dao.impl.EmployeeDaoImpl;
import com.cabbookingapp.model.Employee;
import com.cabbookingapp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	public void insertEmployeeValidate(Employee employee) {
		int isEmployeeNameValid = employeeNameValidate(employee.getEmployeeName());
		int isEmployeeEmailValid = employeeEmailValidate(employee.getEmployeeEmail());
		int isEmployeePwordValid = employeePwordValidate(employee.getEmployeePassword());
		int isManagerIdentityvalid = employeeManagerIdentity(employee.getManagerIdentity());

		if (isEmployeeNameValid + isEmployeeEmailValid + isEmployeePwordValid + isManagerIdentityvalid == 4) {
			EmployeeDao ed = new EmployeeDaoImpl();
			ed.insertEmployee(employee);
		} else {
			System.err.println("Please re enter Employee details");
		}
	}

	private int employeeManagerIdentity(int managerIdentity) {
		if (managerIdentity < 0) {
			System.err.println("Manager id should not be negative");
		} else {
			return 1;
		}
		return 0;
	}

	private int employeePwordValidate(String employeePassword) {
		if (employeePassword.length() < 8) {
			System.err.println("Password length must contain eight characters");
		} else {
			return 1;
		}
		return 0;
	}

	private int employeeEmailValidate(String employeeEmail) {
		if (!employeeEmail.contains("@gmail.com")) {
			System.err.println("Enter a valid email id");
		} else {
			return 1;
		}
		return 0;
	}

	private int employeeNameValidate(String employeeName) {
		if (employeeName.isBlank() || employeeName.isEmpty()) {
			System.err.println("The employee name should be empty");
		} else {
			return 1;
		}
		return 0;
	}

	public void deleteEmployeeValidate(int employeeId) {
		int isEmployeeId = employeeIdValidate(employeeId);
		if (isEmployeeId == 1) {
			EmployeeDao ed = new EmployeeDaoImpl();
			ed.deleteEmployee(employeeId);
		}

	}

	private int employeeIdValidate(int employeeId) {
		if (employeeId < 0) {
			System.err.println("Employee id should not be zero or negative");
		} else {
			return 1;
		}
		return 0;
	}

	public void updateEmployeeValidate(String password, int employeeId) {
		int isPword = employeePwordValidate(password);
		int isEmployeeId = employeeIdValidate(employeeId);

		if (isPword + isEmployeeId == 2) {
			EmployeeDao ed = new EmployeeDaoImpl();
			ed.updatePassword(password, isEmployeeId);
		}

	}

	public void findEmployeeValidate(Employee employee) {
		if (employee.getEmployeeId() <= 0) {
			System.err.println("Employee id should not be zero or negative");

		} else {
			Employee.printObject(employee);
		}

	}

}
