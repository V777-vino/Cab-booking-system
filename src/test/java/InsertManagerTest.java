import java.util.Scanner;

import com.cabbookingapp.model.Manager;
import com.cabbookingapp.service.ManagerService;
import com.cabbookingapp.service.impl.ManagerServiceImpl;

public class InsertManagerTest {

	public static void main(String[] args) {
		insertManager();

	}
	public static void insertManager() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the manager name:");
		String managerName = sc.next();
		System.out.println("Enter the manager email:");
		String managerEmail = sc.next();
		System.out.println("Enter the manager password:");
		String managerPassword = sc.next();
		
		Manager manager = new Manager();
		
		manager.setManagerName(managerName);
        manager.setManagerEmail(managerEmail);
        manager.setManagerPassword(managerPassword);
        
        ManagerService ms = new ManagerServiceImpl();
        ms.insertManagerValidate(manager);
	}

}
