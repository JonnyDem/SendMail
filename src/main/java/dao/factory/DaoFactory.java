package dao.factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;

/**
 * Created by Ваня on 20.09.2017.
 */
public class DaoFactory {

    /**
     * @return new UserDaoImpl
     */
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
