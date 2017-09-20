package controller;

import services.SendEmailService;
import services.factory.ServiceFactory;


/**
 * Created by Ваня on 19.09.2017.
 */
public class UserController {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread((Runnable) ServiceFactory.getUserService(),"Add user thread");
        thread.start();
        thread.join();
        SendEmailService emailService = ServiceFactory.getEmailService();
    }
}
