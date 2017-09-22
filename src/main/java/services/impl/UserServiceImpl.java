package services.impl;

import dao.UserDao;
import dao.factory.DaoFactory;
import model.User;
import services.UserService;

/**
 * Created by Ваня on 20.09.2017.
 */
public class UserServiceImpl implements UserService{

    @Override
    public void putUserToDataBase(User user) {
        UserDao userDao = DaoFactory.getUserDao();
        userDao.putUserToDataBase(user);
    }
}
