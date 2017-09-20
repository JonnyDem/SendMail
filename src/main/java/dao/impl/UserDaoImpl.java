package dao.impl;

import dao.UserDao;
import database.UsereDataBase;
import model.User;

/**
 * Created by Ваня on 20.09.2017.
 */
public class UserDaoImpl implements UserDao,Runnable {

    Thread t=new Thread(this);

    @Override
    public void putUserToDataBase() {
        int i = 1;
        while (i <= 10) {
            UsereDataBase.listOfUsers.add(new User());
            System.out.println("User: " + i + " added to list");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
       this.putUserToDataBase();
    }
}

