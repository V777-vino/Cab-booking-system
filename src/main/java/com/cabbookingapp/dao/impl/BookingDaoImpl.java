package com.cabbookingapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.cabbookingapp.dao.BookingDao;
import com.cabbookingapp.model.Booking;
import com.cabbookingapp.service.BookingService;
import com.cabbookingapp.service.impl.BookingServiceImpl;
import com.cabbookingapp.util.ConnectionUtil;

public class BookingDaoImpl implements BookingDao {

	public void insertBooking(Booking booking) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO booking(employee_id,src,destn,manager_id,approve,cab_number)"
							+ "VALUES(?,?,?,?,?,?);");

			statement.setInt(1, booking.getEmployeeId());
			statement.setString(2, booking.getSrc());
			statement.setString(3, booking.getDestn());
			statement.setInt(4, booking.getManagerId());
			statement.setBoolean(5, booking.getApprove());
			statement.setInt(6, booking.getCabNumber());

			if (statement.executeUpdate() == 1) {
				System.out.println("Booking details added");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void updateApprove(boolean approve, int bookingId) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("UPDATE booking SET approve = ? WHERE booking_id = ?;");
			statement.setBoolean(1, approve);
			statement.setInt(2, bookingId);
			if (statement.executeUpdate() == 1) {
				System.out.println("Booking detail updated");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public Booking findBooking(int bookingId) {
		Booking b = new Booking();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT*FROM booking WHERE booking_id =?;");
			statement.setInt(1, bookingId);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				b.setBookingId(rs.getInt(1));
				b.setEmployeeId(rs.getInt(2));
				b.setSrc(rs.getString(3));
				b.setDestn(rs.getString(4));
				b.setDate(LocalDate.parse(rs.getString(5)));
				b.setTime(LocalTime.parse(rs.getString(6)));
				b.setManagerId(rs.getInt(7));
				b.setApprove(rs.getBoolean(8));
				b.setCabNumber(rs.getInt(9));

				BookingService bs = new BookingServiceImpl();
				bs.findBookingByBookingId(b);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return b;
	}

	public List<Booking> findBookingByManager(int managerId) {
		ArrayList<Booking> booking = new ArrayList<Booking>();
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT*FROM booking WHERE manager_id =?;");
			statement.setInt(1, managerId);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Booking b = new Booking();
				b.setBookingId(rs.getInt(1));
				b.setEmployeeId(rs.getInt(2));
				b.setSrc(rs.getString(3));
				b.setDestn(rs.getString(4));
				b.setDate(LocalDate.parse(rs.getString(5)));
				b.setTime(LocalTime.parse(rs.getString(6)));
				b.setManagerId(rs.getInt(7));
				b.setApprove(rs.getBoolean(8));
				b.setCabNumber(rs.getInt(9));
				
				booking.add(b);
				Booking.print(booking);

				
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return booking;
	}

}
