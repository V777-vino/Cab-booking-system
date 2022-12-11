import java.util.Scanner;

import com.cabbookingapp.dao.EmployeeDao;
import com.cabbookingapp.dao.impl.EmployeeDaoImpl;

public class FindAllEmployeeByManagerIdTest {

	public static void main(String[] args) {
		findAllEmployeeByManagerId();

	}

	public static void findAllEmployeeByManagerId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id:");
		int managerId = sc.nextInt();
		EmployeeDao ed = new EmployeeDaoImpl();

		ed.findAllEmployeeByManagerId(managerId);

	}

}
