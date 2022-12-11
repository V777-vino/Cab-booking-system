import java.util.Scanner;

import com.cabbookingapp.dao.BookingDao;
import com.cabbookingapp.dao.impl.BookingDaoImpl;

public class FindBookingDetailsByManagerIdTest {

	public static void main(String[] args) {
		findBookingDetailsByManagerId();
	}

	public static void findBookingDetailsByManagerId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id:");
		int managerId = sc.nextInt();
		BookingDao bd = new BookingDaoImpl();
		bd.findBookingByManager(managerId);
	}

}
