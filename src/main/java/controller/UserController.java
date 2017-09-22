package controller;

import dao.UserDao;
import dao.factory.DaoFactory;
import model.User;
import services.factory.ServiceFactory;
import services.impl.SendEmailServiceImpl;


/**
 * Created by Ваня on 19.09.2017.
 */
public class UserController {

    public static void main(String[] args) throws InterruptedException {

        UserDao userDao = DaoFactory.getUserDao();
        SendEmailServiceImpl.eAddress = "vertex-java@ukr.net";
        SendEmailServiceImpl.subject = "Sending test";
        int i = 1;
        while (i <= 100) {
            User user = new User();
            userDao.putUserToDataBase(user);
            i++;
            Thread.sleep(1000);
            String str = "" + i;
            if (str.endsWith("0")) {
                SendEmailServiceImpl.txt = i + " users signed up";
                ServiceFactory.getEmailService();
                System.out.println(i);
            }
        }
    }
}
