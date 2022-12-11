import java.util.Scanner;

import com.cabbookingapp.service.CabService;
import com.cabbookingapp.service.impl.CabServiceImpl;

public class DeleteCabTest {

	public static void main(String[] args) {
		deleteCab();
	}

	public static void deleteCab() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a cab number:");
		int cabNumber = sc.nextInt();

		CabService cs = new CabServiceImpl();

		cs.deleteCabValidate(cabNumber);
	}

}
