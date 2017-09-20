package sendingmassage;



/**
 * Created by Ваня on 19.09.2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(new User(),"First thread");
        thread.start();
        thread.join();
        Sender sender = new Sender("vertex-java@ukr.net", "vertex2017");

    }
}
