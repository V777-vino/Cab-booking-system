import java.util.Scanner;

import com.cabbookingapp.model.Employee;
import com.cabbookingapp.service.EmployeeService;
import com.cabbookingapp.service.impl.EmployeeServiceImpl;

public class InsertEmployeeTest {

	public static void main(String[] args) {
		insertEmployee();
	}

	public static void insertEmployee() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee name:");
		String employeeName = sc.next();
		System.out.println("Enter the employee email:");
		String employeeEmail = sc.next();
		System.out.println("Employee the email pasword:");
		String employeePassword = sc.next();
		System.out.println("Enter the manager id:");
		int managerIdentity = sc.nextInt();

		Employee employee = new Employee();

		employee.setEmployeeName(employeeName);
		employee.setEmployeeEmail(employeeEmail);
		employee.setEmployeePassword(employeePassword);
		employee.setManagerIdentity(managerIdentity);

		EmployeeService es = new EmployeeServiceImpl();
		es.insertEmployeeValidate(employee);

	}

}
