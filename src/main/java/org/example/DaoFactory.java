package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public ConnectionMaker connectionMaker() {
//        return new DConnectionMaker();
//        return new NConnectionMaker();
//        return new LocalDBConnectionMaker();
        return new ProductionDBConnectionMaker();
    }

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
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
