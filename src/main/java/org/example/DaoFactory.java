package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean // --------------------------------------------> <bean
    public ConnectionMaker connectionMaker() { // ------->     id="connectionMaker"
//        return new DConnectionMaker();
//        return new NConnectionMaker();
//        return new LocalDBConnectionMaker();
        return new ProductionDBConnectionMaker(); // ---->     class="org.example.ProductionDBConnectionMaker" />
    }

    @Bean
    public UserDao userDao() {
//        return new UserDao(connectionMaker());
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(connectionMaker());
        return userDao;
    }

    /*
    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());
    }
     */
}
