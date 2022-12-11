import java.util.Scanner;

import com.cabbookingapp.dao.ManagerDao;
import com.cabbookingapp.dao.impl.ManagerDaoImpl;

public class FindManagerByManagerIdTest {

	public static void main(String[] args) {
		findManagerByManagerId();

	}

	public static void findManagerByManagerId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id:");
		int managerId = sc.nextInt();
		ManagerDao md = new ManagerDaoImpl();
		md.findManager(managerId);

	}

}
