import java.util.Scanner;

import com.cabbookingapp.dao.EmployeeDao;
import com.cabbookingapp.dao.impl.EmployeeDaoImpl;

public class EmployeeLoginTest {

	public static void main(String[] args) throws Exception {
		employeeLogin();
	}

	public static void employeeLogin() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your employee id:");
		int employeeId = sc.nextInt();
		System.out.println("Enter your password:");
		String employeePassword = sc.next();

		EmployeeDao ed = new EmployeeDaoImpl();
		int a = ed.employeeLogin(employeeId, employeePassword);
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
