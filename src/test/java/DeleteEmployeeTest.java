import java.util.Scanner;

import com.cabbookingapp.service.EmployeeService;
import com.cabbookingapp.service.impl.EmployeeServiceImpl;

public class DeleteEmployeeTest {

	public static void main(String[] args) {
		deleteEmployee();
	}

	public static void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int employeeId = sc.nextInt();

		EmployeeService es = new EmployeeServiceImpl();
		es.deleteEmployeeValidate(employeeId);
	}

}
