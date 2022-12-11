import java.util.Scanner;

import com.cabbookingapp.model.Booking;
import com.cabbookingapp.service.BookingService;
import com.cabbookingapp.service.impl.BookingServiceImpl;

public class InsertBookingTest {

	public static void main(String[] args) {
		insertBooking();

	}

	public static void insertBooking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int employeeId = sc.nextInt();
		System.out.println("Enter the source:");
		String src = sc.next();
		System.out.println("Enter the destination:");
		String destn = sc.next();
		System.out.println("Enter the manager id:");
		int managerId = sc.nextInt();
		System.out.println("Enter the approval value:(true/false)");
		String approve1 = sc.next();
		boolean approve = Boolean.parseBoolean(approve1);
		System.out.println("Enter the cab number:");
		int cabNumber = sc.nextInt();

		Booking booking = new Booking();

		booking.setEmployeeId(employeeId);
		booking.setSrc(src);
		booking.setDestn(destn);
		booking.setManagerId(managerId);
		booking.setApprove(approve);
		booking.setCabNumber(cabNumber);

		BookingService bs = new BookingServiceImpl();
		bs.insertBookingValidate(booking);
	}

}
