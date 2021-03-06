package services.impl;


import services.SendEmailService;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Ваня on 19.09.2017.
 */
public class SendEmailServiceImpl implements Runnable , SendEmailService{

    private Thread t;
    private String  username;
    private String  password;
    private Properties props;
    public static String eAddress;
    public static String txt;
    public static String subject;

    public SendEmailServiceImpl(String username, String password) {
        t = new Thread(this, "Message thread");
        this.username = username;
        this.password = password;

        props = new Properties();
        props.put("mail.smtp.host","smtp.ukr.net");
        props.put("mail.smtp.socketFactory.port", "2525");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","2525");
        t.start();
    }


    /**
     * {@link SendEmailService}
     */
    public void send(String subject, String text,String toEmail){
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            System.out.println("Message was successfully delivered");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts");
        this.send(subject, txt, eAddress);
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
