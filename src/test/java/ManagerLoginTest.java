import java.util.Scanner;

import com.cabbookingapp.dao.ManagerDao;
import com.cabbookingapp.dao.impl.ManagerDaoImpl;

public class ManagerLoginTest {

	public static void main(String[] args) throws Exception {
		managerLogin();
	}

	public static void managerLogin() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id:");
		int managerId = sc.nextInt();
		System.out.println("Enter your password:");
		String managerPassword = sc.next();

		ManagerDao md = new ManagerDaoImpl();
		int a = md.managerLogin(managerId, managerPassword);

		if (a == 1) {
			System.out.println("loggedin succesfully");
		} else if (a == -1) {
			System.out.println("Invalid credentials");
		} else if (a == 0) {
			System.out.println("no user found");
			System.exit(1);
		}
	}

}
