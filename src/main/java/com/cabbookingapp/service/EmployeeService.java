package com.cabbookingapp.service;

import com.cabbookingapp.model.Employee;

public interface EmployeeService {
	void insertEmployeeValidate(Employee employee);

	void deleteEmployeeValidate(int employeeId);

	void updateEmployeeValidate(String password, int employeeId);

	void findEmployeeValidate(Employee employee);

}
