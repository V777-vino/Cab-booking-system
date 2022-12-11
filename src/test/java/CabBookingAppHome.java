import java.util.Scanner;

public class CabBookingAppHome {

	public static void main(String[] args) throws Exception {
		home();
	}

	public static void home() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome to Cab Booking App");
		System.out.println("\n1.Login as Admin");
		System.out.println("2.Login as Manager");
		System.out.println("3.Login as Employee");
		int num = sc.nextInt();
		if (num == 1) {
			AdminLoginTest.adminLogin();
			AdminMenu.adminMenu();
		} else if (num == 2) {
			ManagerLoginTest.managerLogin();
			ManagerMenu.managerMenu();
		} else if (num == 3) {
			EmployeeLoginTest.employeeLogin();
			EmployeeMenu.employeeMenu();
		} else {
			System.out.println("\nInvalid input");
			CabBookingAppHome.home();
		}
	}

}
