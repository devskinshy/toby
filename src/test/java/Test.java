import org.example.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao =context.getBean("userDao", UserDao.class);

        User originUser = new User();
        originUser.setId("test");
        originUser.setName("tester");
        originUser.setPassword("pw");

        dao.add(originUser);

        System.out.println(originUser.getId() + "등록 성공");

        User dbUser = dao.get(originUser.getId());
        System.out.println(dbUser.getName());
        System.out.println(dbUser.getPassword());
        System.out.println(dbUser.getId() + "조회 성공");

        dao.delete(originUser);
    }
}
