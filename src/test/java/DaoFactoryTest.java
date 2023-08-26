import org.example.DaoFactory;
import org.example.UserDao;

public class DaoFactoryTest {
    public static void main(String[] args) {
        DaoFactory factory = new DaoFactory();

        UserDao dao1 = factory.userDao();
        UserDao dao2 = factory.userDao();

        System.out .println(dao1);
        System.out.println(dao2);
    }
}
