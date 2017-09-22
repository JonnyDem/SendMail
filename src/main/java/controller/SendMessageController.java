package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import services.factory.ServiceFactory;
import services.impl.SendEmailServiceImpl;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ваня on 22.09.2017.
 */
public class SendMessageController implements Initializable {

    @FXML
    public Button btnSendEmail;
    @FXML
    public  TextField enterMailField;
    @FXML
    public  TextArea txtArea;
    @FXML
    public TextField subjectField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
     btnSendEmail.setOnAction(event -> sendEmail());
    }

    /**
     * Sends e-mail
     */
    private void sendEmail(){
        SendEmailServiceImpl.eAddress = enterMailField.getText();
        SendEmailServiceImpl.subject = subjectField.getText();
        SendEmailServiceImpl.txt = txtArea.getText();
        ServiceFactory.getEmailService();
    }
}
