package com.cabbookingapp.model;

import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeePassword;
	private Integer managerIdentity;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public int getManagerIdentity() {
		return managerIdentity;
	}

	public void setManagerIdentity(Integer managerIdentity) {
		this.managerIdentity = managerIdentity;
	}

	public static void printObject(Employee e) {
		String employeeDetails = "Employee id:" + e.getEmployeeId() + "\n" + "Employee name:" + e.getEmployeeName()
				+ "\n" + "Employee email:" + e.getEmployeeEmail() + "\n" + "Manager id:" + e.getManagerIdentity();
		System.out.println(employeeDetails);
		System.out.println("=========================");

	}

	public static void print(ArrayList<Employee> employee) {
		try {
			for (Employee e : employee) {
				String employeeDetails = "Employee id:" + e.getEmployeeId() + "\n" + "Employee name:"
						+ e.getEmployeeName() + "\n" + "Employee email:" + e.getEmployeeEmail() + "\n" + "Manager id:"
						+ e.getManagerIdentity();
				byte[] content = employeeDetails.getBytes();
				Path path = Paths.get("Employee.txt");

				FileWriter writer = new FileWriter("Employee.txt");
				writer.write(System.lineSeparator());
				System.out.println(employeeDetails);
				System.out.println("=========================");

			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
