import java.util.Scanner;

import com.cabbookingapp.dao.AdminDao;
import com.cabbookingapp.dao.impl.AdminDaoImpl;

public class AdminLoginTest {

	public static void main(String[] args) throws Exception {
		adminLogin();

	}

	public static void adminLogin() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the admin id:");
		int adminId = sc.nextInt();
		System.out.println("Enter the admin password:");
		String adminPassword = sc.next();

		AdminDao ad = new AdminDaoImpl();
		int a = ad.Adminlogin(adminId, adminPassword);
		if (a == 1) {
			System.out.println("\nloggedin succesfully");
		} else if (a == -1) {
			System.out.println("\nInvalid credentials");
		} else if (a == 0) {
			System.out.println("\nNo user found");
			System.exit(1);
		}
	}

}
