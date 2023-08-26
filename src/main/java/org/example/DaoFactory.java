package org.example;

public class DaoFactory {
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
//        return new NConnectionMaker();
    }

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
