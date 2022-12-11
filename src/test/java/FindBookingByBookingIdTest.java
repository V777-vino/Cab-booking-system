import java.util.Scanner;

import com.cabbookingapp.dao.BookingDao;
import com.cabbookingapp.dao.impl.BookingDaoImpl;

public class FindBookingByBookingIdTest {

	public static void main(String[] args) {
		findBookingByBookingId();

	}

	public static void findBookingByBookingId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the booking id:");
		int bookingId = sc.nextInt();

		BookingDao bd = new BookingDaoImpl();
		bd.findBooking(bookingId);
	}

}
