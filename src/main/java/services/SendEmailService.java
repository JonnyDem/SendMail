package services;

/**
 * Created by Ваня on 20.09.2017.
 */
public interface SendEmailService {

    /**
     * sends message to e-mail
     *
     * @param subject-theme of the massage
     * @param text-text of massage
     * @param toEmail- e-mail address of recipient
     */
    public void send(String subject, String text, String toEmail);
}
