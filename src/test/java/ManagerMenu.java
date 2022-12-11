import java.util.Scanner;

public class ManagerMenu {

	public static void main(String[] args) throws Exception {
		managerMenu();

	}

	public static void managerMenu() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.View your details");
		System.out.println("2.Update your details");
		System.out.println("3.View all employees");
		System.out.println("4.Give approval");
		System.out.println("5.Logout");

		System.out.println("\nEnter your choice:");
		int choice = sc.nextInt();
		if (choice == 1) {
			FindManagerByManagerIdTest.findManagerByManagerId();
			System.out.println("Returning manager's feature page");
			ManagerMenu.managerMenu();
		} else if (choice == 2) {
			UpdateManagerDetailsTest.updateManagerDetails();
		} else if (choice == 3) {
			FindAllEmployeeByManagerIdTest.findAllEmployeeByManagerId();

		} else if (choice == 4) {
			UpdateBookingDetailTest.updateBookingDetail();
		} else if (choice == 5) {
			System.out.println("Returning to the Home page");
			System.exit(1);
			CabBookingAppHome.home();
		} else {
			System.out.println("\nWrong input");
			ManagerMenu.managerMenu();
		}
	}

}
