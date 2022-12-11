package com.cabbookingapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cabbookingapp.dao.EmployeeDao;
import com.cabbookingapp.model.Cab;
import com.cabbookingapp.model.Employee;
import com.cabbookingapp.service.EmployeeService;
import com.cabbookingapp.service.impl.EmployeeServiceImpl;
import com.cabbookingapp.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	public void insertEmployee(Employee employee) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO employee(employee_name,employee_email,employee_password,manager_identity)"
							+ "VALUES(?,?,?,?);");
			statement.setString(1, employee.getEmployeeName());
			statement.setString(2, employee.getEmployeeEmail());
			statement.setString(3, employee.getEmployeePassword());
			statement.setInt(4, employee.getManagerIdentity());
			if (statement.executeUpdate() == 1) {
				System.out.println("Employee details added");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void deleteEmployee(int employeeId) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("DELETE FROM employee WHERE employee_id = ?;");
			statement.setInt(1, employeeId);
			if (statement.executeUpdate() == 1) {
				System.out.println("Employee detail deleted");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void updatePassword(String password, int employeeId) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("UPDATE employee SET employee_password = ? WHERE employee_id =?;");
			statement.setString(1, password);
			statement.setInt(2, employeeId);
			if (statement.executeUpdate() == 1) {
				System.out.println("Employee detail updated");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public List<Employee> findAllEmployeeByManagerId(int managerId) {
		ArrayList<Employee> employee = new ArrayList<Employee>();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT*FROM employee where manager_identity=?;");
			statement.setInt(1, managerId);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();

				e.setEmployeeId(rs.getInt(1));
				e.setEmployeeName(rs.getString(2));
				e.setEmployeeEmail(rs.getString(3));
				e.setManagerIdentity(rs.getInt(5));

				employee.add(e);
				Employee.print(employee);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return employee;
	}

	public Employee findEmployee(int employeeId) {
		Employee e = new Employee();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT*FROM employee where employee_id=?;");
			statement.setInt(1, employeeId);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				e.setEmployeeId(rs.getInt(1));
				e.setEmployeeName(rs.getString(2));
				e.setEmployeeEmail(rs.getString(3));
				e.setManagerIdentity(rs.getInt(5));

				EmployeeService es = new EmployeeServiceImpl();
				es.findEmployeeValidate(e);
			}
		} catch (Exception m) {
			System.err.println(m.getMessage());
		}

		return e;
	}

	public int employeeLogin(int employeeId, String employeePassword) throws Exception {
		int employeeId1 = 0;
		String employeePassword1 = null;

		Connection connection = ConnectionUtil.getConnection();
		Statement statement = connection.createStatement();
		String query = "SELECT *FROM EMPLOYEE WHERE employee_id ='" + employeeId + "' AND employee_password ='"
				+ employeePassword + "'";
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			employeeId1 = rs.getInt("employee_id");
			employeePassword1 = rs.getString("employee_password");
		}
		int result = 0;
		if (employeeId1 == 0) {
			return 0;
		} else if (employeePassword1.equals(employeePassword)) {
			result = 1;
		} else {
			result = -1;
		}

		return result;
	}

}
