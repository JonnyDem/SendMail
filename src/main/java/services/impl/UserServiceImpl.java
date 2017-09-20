package services.impl;

import dao.UserDao;
import dao.factory.DaoFactory;
import services.UserService;

/**
 * Created by Ваня on 20.09.2017.
 */
public class UserServiceImpl implements UserService, Runnable{

    @Override
    public void putUserToDataBase() {
        UserDao userDao = DaoFactory.getUserDao();
        userDao.putUserToDataBase();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts");
        this.putUserToDataBase();
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
