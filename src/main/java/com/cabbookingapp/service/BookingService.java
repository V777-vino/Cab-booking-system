package com.cabbookingapp.service;

import com.cabbookingapp.model.Booking;

public interface BookingService {
	void insertBookingValidate(Booking booking);

	void updateBooingValidate(int bookingId, boolean approval);

	void findBookingByBookingId(Booking booking);

}
