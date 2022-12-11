package com.cabbookingapp.model;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Cab {

	private Integer cabNumber;
	private String cabName;
	private Integer seaters;

	public Integer getCabNumber() {
		return cabNumber;
	}

	public void setCabNumber(Integer cabNumber) {
		this.cabNumber = cabNumber;
	}

	public String getCabName() {
		return cabName;
	}

	public void setCabName(String cabName) {
		this.cabName = cabName;
	}

	public Integer getSeaters() {
		return seaters;
	}

	public void setSeaters(Integer seaters) {
		this.seaters = seaters;
	}

	public static void print(ArrayList<Cab> cab) {
		try {
			for (Cab c : cab) {
				String cabDetails = "Cab number:" + c.getCabNumber() + "\n" + "Cab name:" + c.getCabName() + "\n"
						+ "Seaters:" + c.getSeaters();
				byte[] content = cabDetails.getBytes();
				Path path = Paths.get("Cab.txt");

				FileWriter writer = new FileWriter("Cab.txt");
				writer.write(System.lineSeparator());
				System.out.println(cabDetails);
				System.out.println("=========================");

			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void printObject(Cab c) {
		String cabDetails = "Cab number:" + c.getCabNumber() + "\n" + "Cab name:" + c.getCabName() + "\n" + "Seaters:"
				+ c.getSeaters();
		System.out.println(cabDetails);
		System.out.println("=========================");

	}

}
