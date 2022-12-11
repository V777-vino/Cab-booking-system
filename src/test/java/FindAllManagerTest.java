import com.cabbookingapp.dao.ManagerDao;
import com.cabbookingapp.dao.impl.ManagerDaoImpl;

public class FindAllManagerTest {

	public static void main(String[] args) {
		findAllManager();

	}

	public static void findAllManager() {
		ManagerDao md = new ManagerDaoImpl();
		md.findAllManager();
	}

}
