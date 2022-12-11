import java.util.Scanner;

import com.cabbookingapp.model.Cab;
import com.cabbookingapp.service.CabService;
import com.cabbookingapp.service.impl.CabServiceImpl;

public class InsertCabTest {

	public static void main(String[] args) {
		insertCab();

	}

	public static void insertCab() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the cab name:");
		String cabName = sc1.nextLine();
		System.out.println("Enter the count of seaters:");
		int seaters = sc.nextInt();

		Cab cab = new Cab();
		cab.setCabName(cabName);
		cab.setSeaters(seaters);

		CabService cs = new CabServiceImpl();

		cs.insertCabValidate(cab);
	}

}
