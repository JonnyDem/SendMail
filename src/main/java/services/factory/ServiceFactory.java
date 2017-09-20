package services.factory;

import services.SendEmailService;
import services.UserService;
import services.impl.SendEmailServiceImpl;
import services.impl.UserServiceImpl;

/**
 * Created by Ваня on 20.09.2017.
 */
public class ServiceFactory  {

    /**
     * @return new SendEmailServiceImpl
     */
    public static SendEmailService getEmailService(){
        return new SendEmailServiceImpl("vertex-java@ukr.net", "vertex2017");
    }

    /**
     * @return new UserServiceImpl
     */
    public static UserService getUserService(){
        return new UserServiceImpl();
    }
}
