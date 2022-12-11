import java.util.Scanner;

public class AdminMenu {

	public static void main(String[] args) throws Exception {
		adminMenu();
	}

	public static void adminMenu() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.Add manager");
		System.out.println("2.Add employee");
		System.out.println("3.Add cab");
		System.out.println("4.View all managers");
		System.out.println("5.View all employees");
		System.out.println("6.View all cab");
		System.out.println("7.Delete manager");
		System.out.println("8.Delete employee");
		System.out.println("9.Delete manager");
		System.out.println("10.Delete cab");
		System.out.println("11.Logout");

		System.out.println("\nEnter your choice:");
		int choice = sc.nextInt();
		if (choice == 1) {
			InsertManagerTest.insertManager();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 2) {
			InsertEmployeeTest.insertEmployee();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 3) {
			InsertCabTest.insertCab();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 4) {
			FindAllManagerTest.findAllManager();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 5) {
			FindAllEmployeeByManagerIdTest.findAllEmployeeByManagerId();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 6) {
			FindAllCabTest.findAllCab();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 7) {
			DeleteManagerByManagerIdTest.deleteManagerByManagerId();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 8) {
			DeleteEmployeeTest.deleteEmployee();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 9) {
			DeleteManagerByManagerIdTest.deleteManagerByManagerId();
		} else if (choice == 10) {
			DeleteCabTest.deleteCab();
			System.out.println("\nReturning admin's features page");
			AdminMenu.adminMenu();
		} else if (choice == 11) {
			System.out.println("\nReturning to the Home page");
			CabBookingAppHome.home();
		} else {
			System.out.println("\nWrong input");
			AdminMenu.adminMenu();
		}

	}

}
