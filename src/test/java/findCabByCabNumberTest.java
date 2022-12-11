import java.util.Scanner;

import com.cabbookingapp.dao.CabDao;
import com.cabbookingapp.dao.impl.CabDaoImpl;

public class findCabByCabNumberTest {

	public static void main(String[] args) {
		findCabByCabNumber();
	}

	public static void findCabByCabNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cab number:");
		int cabNumber = sc.nextInt();
		CabDao cd = new CabDaoImpl();
		cd.findCab(cabNumber);
	}

}
