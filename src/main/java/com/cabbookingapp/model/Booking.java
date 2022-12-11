package com.cabbookingapp.model;

import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Booking {
	private Integer bookingId;
	private Integer employeeId;
	private String src;
	private String destn;
	private LocalDate date;
	private LocalTime time;
	private Integer managerId;

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	private Boolean approve;
	private Integer cabNumber;

	public Integer getBookingId() {
		return bookingId;
	}

	public Boolean getApprove() {
		return approve;
	}

	public void setApprove(Boolean approve) {
		this.approve = approve;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDestn() {
		return destn;
	}

	public void setDestn(String destn) {
		this.destn = destn;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Integer getCabNumber() {
		return cabNumber;
	}

	public void setCabNumber(Integer cabNumber) {
		this.cabNumber = cabNumber;
	}

	public static void printObject(Booking b) {
		String bookingDetails = "Booking id:" + b.getBookingId() + "\n" + "Employee id:" + b.getEmployeeId() + "\n"
				+ "Source point:" + b.getSrc() + "\n" + "Destination point:" + b.getDestn() + "\n" + "Date:"
				+ b.getDate() + "\n" + "Time:" + b.getTime() + "\n" + "Manager id:" + b.getManagerId() + "\n"
				+ "Approve:" + b.getApprove() + "\n" + "Cab number:" + b.getCabNumber();
		System.out.println(bookingDetails);
		System.out.println("=========================");
	}

	public static void print(ArrayList<Booking> booking) {
		try {
			for (Booking b : booking) {
				String bookingDetails = "Booking id:" + b.getBookingId() + "\n" + "Employee id:" + b.getEmployeeId()
						+ "\n" + "Source point:" + b.getSrc() + "\n" + "Destination point:" + b.getDestn() + "\n"
						+ "Date:" + b.getDate() + "\n" + "Time:" + b.getTime() + "\n" + "Manager id:" + b.getManagerId()
						+ "\n" + "Approve:" + b.getApprove() + "\n" + "Cab number:" + b.getCabNumber();
				byte[] content = bookingDetails.getBytes();
				Path path = Paths.get("Booking.txt");

				FileWriter writer = new FileWriter("Booking.txt");
				writer.write(System.lineSeparator());
				System.out.println(bookingDetails);
				System.out.println("=========================");

			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
