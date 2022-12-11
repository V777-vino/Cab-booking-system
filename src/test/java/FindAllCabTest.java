import com.cabbookingapp.dao.CabDao;
import com.cabbookingapp.dao.impl.CabDaoImpl;

public class FindAllCabTest {

	public static void main(String[] args) {
		findAllCab();
	}

	public static void findAllCab() {
		CabDao cd = new CabDaoImpl();
		cd.findAllCab();

	}

}
