package org.example;

public class DaoFactory {
    public UserDao userDao() {
        return new UserDao(new DConnectionMaker());
//        return new UserDao(new NConnectionMaker());
    }

    /*
    public AccountDao accountDao() {
        return new AccountDao(new DConnectionMaker());
//        return new UserDao(new NConnectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(new DConnectionMaker());
//        return new UserDao(new NConnectionMaker());
    }
     */
}
