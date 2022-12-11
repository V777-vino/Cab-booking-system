import java.util.Scanner;

import com.cabbookingapp.service.ManagerService;
import com.cabbookingapp.service.impl.ManagerServiceImpl;

public class DeleteManagerByManagerIdTest {

	public static void main(String[] args) {
		deleteManagerByManagerId();

	}

	public static void deleteManagerByManagerId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id:");
		int managerId = sc.nextInt();

		ManagerService ms = new ManagerServiceImpl();

		ms.deleteManagerValidate(managerId);
	}
}
