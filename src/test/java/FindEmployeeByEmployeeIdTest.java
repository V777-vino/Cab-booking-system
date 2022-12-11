import java.util.Scanner;

import com.cabbookingapp.dao.EmployeeDao;
import com.cabbookingapp.dao.impl.EmployeeDaoImpl;

public class FindEmployeeByEmployeeIdTest {

	public static void main(String[] args) {
		findEmployeeByEmployeeId();
	}

	public static void findEmployeeByEmployeeId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int employeeId = sc.nextInt();
		EmployeeDao ed = new EmployeeDaoImpl();
		ed.findEmployee(employeeId);

	}

}
