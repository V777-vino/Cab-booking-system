package com.cabbookingapp.dao;

import java.util.List;

import com.cabbookingapp.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee employee);

	void deleteEmployee(int employeeId);

	void updatePassword(String password, int employeeId);

	List<Employee> findAllEmployeeByManagerId(int managerId);

	Employee findEmployee(int employeeId);

	int employeeLogin(int employeeId, String employeePassword) throws Exception;

}
