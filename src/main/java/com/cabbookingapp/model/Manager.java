package com.cabbookingapp.model;

import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Manager {
	private Integer managerId;
	private String managerName;
	private String managerEmail;
	private String managerPassword;

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public String getManagerPassword() {
		return managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}

	public static void printObject(Manager m) {
		String managerDetails = "Manager id:" + m.getManagerId() + "\n" + "Manager name:" + m.getManagerName() + "\n"
				+ "Manager email:" + m.getManagerEmail();
		System.out.println(managerDetails);
		System.out.println("=========================");

	}
	public static void print(ArrayList<Manager> manager) {
		try {
			for (Manager m : manager) {
				String managerDetails = "Manager id:" + m.getManagerId() + "\n" + "Manager name:" + m.getManagerName() + "\n"
						+ "Manager email:" + m.getManagerEmail();
				byte[] content = managerDetails.getBytes();
				Path path = Paths.get("Manager.txt");

				FileWriter writer = new FileWriter("Manager.txt");
				writer.write(System.lineSeparator());
				System.out.println(managerDetails);
				System.out.println("=========================");

			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
