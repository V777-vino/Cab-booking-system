import java.util.Scanner;

import com.cabbookingapp.service.ManagerService;
import com.cabbookingapp.service.impl.ManagerServiceImpl;

public class UpdateManagerDetailsTest {

	public static void main(String[] args) {
		updateManagerDetails();
	}

	public static void updateManagerDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id:");
		int managerId = sc.nextInt();
		System.out.println("Enter your new password:");
		String password = sc.next();

		ManagerService ms = new ManagerServiceImpl();

		ms.updateManagerValidate(password, managerId);

	}

}
