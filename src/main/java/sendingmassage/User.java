package sendingmassage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ваня on 19.09.2017.
 */
public class User implements Runnable {

    private static List<User> listOfUsers = new ArrayList<>();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts");
        int i = 1;
        while (i <= 10) {
            listOfUsers.add(new User());
            System.out.println("User: " + i + " added to list");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
