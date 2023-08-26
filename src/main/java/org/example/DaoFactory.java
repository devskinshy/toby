package org.example;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
//        ConnectionMaker connectionMaker = new NConnectionMaker();

        UserDao userDao = new UserDao(connectionMaker);

        return userDao;
    }
}
