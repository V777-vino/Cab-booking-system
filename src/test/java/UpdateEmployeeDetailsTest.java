import java.util.Scanner;

import com.cabbookingapp.service.EmployeeService;
import com.cabbookingapp.service.impl.EmployeeServiceImpl;

public class UpdateEmployeeDetailsTest {

	public static void main(String[] args) {
		updateEmployeeDetails();
	}

	public static void updateEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int employeeId = sc.nextInt();
		System.out.println("Enter your new Password:");
		String password = sc.next();

		EmployeeService es = new EmployeeServiceImpl();
		es.updateEmployeeValidate(password, employeeId);
	}

}
