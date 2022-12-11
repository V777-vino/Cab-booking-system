import java.util.Scanner;

public class UpdateBookingDetailTest {

	public static void main(String[] args) {
		updateBookingDetail();

	}

	public static void updateBookingDetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your booking id:");
		int bookingId = sc.nextInt();
		System.out.println("Enter your approval(true/false):");
		String approval1 = sc.next();
		boolean approval = Boolean.parseBoolean(approval1);

		

	}

}
