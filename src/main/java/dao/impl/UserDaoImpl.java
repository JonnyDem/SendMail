package dao.impl;

import dao.UserDao;
import database.UsereDataBase;
import model.User;

/**
 * Created by Ваня on 20.09.2017.
 */
public class UserDaoImpl implements UserDao{


    @Override
    public void putUserToDataBase(User user) {
        UsereDataBase.listOfUsers.add(user);
    }
}

