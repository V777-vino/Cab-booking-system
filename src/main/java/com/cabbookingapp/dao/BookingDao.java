package com.cabbookingapp.dao;

import java.util.List;

import com.cabbookingapp.model.Booking;

public interface BookingDao {
	void insertBooking(Booking booking);

	void updateApprove(boolean approve, int bookingId);

	Booking findBooking(int bookingId);

	List<Booking> findBookingByManager(int managerId);
}
