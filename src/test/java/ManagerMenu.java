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
			System.out.println("\nReturning manager's feature page");
			ManagerMenu.managerMenu();
		} else if (choice == 2) {
			UpdateManagerDetailsTest.updateManagerDetails();
			System.out.println("\nReturning manager's feature page");
			ManagerMenu.managerMenu();
		} else if (choice == 3) {
			FindAllEmployeeByManagerIdTest.findAllEmployeeByManagerId();
			System.out.println("\nReturning manager's feature page");
			ManagerMenu.managerMenu();

		} else if (choice == 4) {
			UpdateBookingDetailTest.updateBookingDetail();
			System.out.println("\nReturning manager's feature page");
			ManagerMenu.managerMenu();
		} else if (choice == 5) {
			System.out.println("\nReturning to the Home page");
			CabBookingAppHome.home();
		} else {
			System.out.println("\nWrong input");
			ManagerMenu.managerMenu();
		}
	}

}
