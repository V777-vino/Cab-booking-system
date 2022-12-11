import java.util.Scanner;

public class EmployeeMenu {

	public static void main(String[] args) throws Exception {
		employeeMenu();
	}

	public static void employeeMenu() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.View your details");
		System.out.println("2.Update your details");
		System.out.println("3.View Booking detail");
		System.out.println("4.View All Booing details");
		System.out.println("5.Logout");

		System.out.println("\nEnter your choice:");
		int choice = sc.nextInt();
		if (choice == 1) {
			FindEmployeeByEmployeeIdTest.findEmployeeByEmployeeId();
			System.out.println("Returning emploee's feature page");
			EmployeeMenu.employeeMenu();
		} else if (choice == 2) {
			UpdateEmployeeDetailsTest.updateEmployeeDetails();
		} else if (choice == 3) {
			FindBookingByBookingIdTest.findBookingByBookingId();
		} else if (choice == 4) {
			FindBookingDetailsByManagerIdTest.findBookingDetailsByManagerId();

		} else if (choice == 5) {
			System.out.println("Returning to the Home page");
			System.exit(1);
			CabBookingAppHome.home();
		} else {
			System.out.println("\nWrong input");
			EmployeeMenu.employeeMenu();
		}
	}

}
