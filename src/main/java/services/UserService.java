package services;

import model.User;

/**
 * Created by Ваня on 20.09.2017.
 */
public interface UserService {

    /**
     *  puts User to list(data base)
     */
    public void putUserToDataBase(User user);
}
