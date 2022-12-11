package com.cabbookingapp.service.impl;

import com.cabbookingapp.dao.BookingDao;
import com.cabbookingapp.dao.impl.BookingDaoImpl;
import com.cabbookingapp.model.Booking;
import com.cabbookingapp.model.Cab;
import com.cabbookingapp.service.BookingService;

public class BookingServiceImpl implements BookingService {

	public void insertBookingValidate(Booking booking) {
		int isEmployeeId = bookingEmployeeIdValidate(booking.getEmployeeId());
		int isSrc = bookingSrcvalidate(booking.getSrc());
		int isDestn = bookingDestnValidate(booking.getDestn());
		int isManagerId = bookingManagerIdValidate(booking.getManagerId());
		int isApprove = bookingApproveValidate(booking.getApprove());
		int isCabNumber = booingCabNumberValidate(booking.getCabNumber());

		if (isEmployeeId + isSrc + isDestn + isManagerId + isApprove + isCabNumber == 6) {
			BookingDao bd = new BookingDaoImpl();
			bd.insertBooking(booking);
		} else {
			System.err.println("Please re enter Booking details");
		}
	}

	private int bookingApproveValidate(Boolean approve) {
		return 1;
	}

	private int booingCabNumberValidate(Integer cabNumber) {
		if (cabNumber <= 0) {
			System.err.println("Cab number should not be negative");
		} else {
			return 1;
		}
		return 0;
	}

	private int bookingManagerIdValidate(Integer managerId) {
		if (managerId <= 0) {
			System.err.println("Manager id should not be negative");
		} else {
			return 1;
		}
		return 0;
	}

	private int bookingDestnValidate(String destn) {
		if (destn.isBlank() || destn.isEmpty()) {
			System.err.println("The destination point should not be empty");
		} else {
			return 1;
		}
		return 0;
	}

	private int bookingSrcvalidate(String src) {
		if (src.isBlank() || src.isEmpty()) {
			System.err.println("The source point should not be empty");
		} else {
			return 1;
		}
		return 0;
	}

	private int bookingEmployeeIdValidate(Integer employeeId) {
		if (employeeId <= 0) {
			System.err.println("Employee id should not be negative");
		} else {
			return 1;
		}
		return 0;
	}

	public void updateBooingValidate(int bookingId, boolean approval) {
		int isBookingId = bookingIdValidate(bookingId);
		int isApprove = bookingApproveValidate(approval);
		if (isBookingId + isApprove == 2) {
			BookingDao bd = new BookingDaoImpl();
			bd.updateApprove(approval, bookingId);
		}

	}

	private int bookingIdValidate(int bookingId) {
		if (bookingId <= 0) {
			System.err.println("Booking id should not be negative");
		} else {
			return 1;
		}
		return 0;
	}

	public void findBookingByBookingId(Booking booking) {
		if (booking.getBookingId() <= 0) {
			System.err.println("Cab number should not be zero");
		} else {
			Booking.printObject(booking);
		}

	}

}
