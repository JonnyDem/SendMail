package dao;

import model.User;

/**
 * Created by Ваня on 20.09.2017.
 */
public interface UserDao {

    /**
     * puts User to list(data base)
     */
    public void putUserToDataBase(User user);
}
