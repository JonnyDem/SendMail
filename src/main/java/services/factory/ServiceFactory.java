package services.factory;

import services.SendEmailService;
import services.UserService;
import services.impl.SendEmailServiceImpl;
import services.impl.UserServiceImpl;

/**
 * Created by Ваня on 20.09.2017.
 */
public class ServiceFactory  {

    public static SendEmailService getEmailService(){
        return new SendEmailServiceImpl("vertex-java@ukr.net", "vertex2017");
    }

    public static UserService getUserService(){
        return new UserServiceImpl();
    }
}
