package lk.edu.novelnook.novelnook.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class MailUtil {
    // sending email after registration
    public static void sendMail(String receipt) throws Exception{

        System.out.println("Mail Send Preparing.");

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccount = "ireshdilshan46@gmail.com";
        String password = "xuhk xtxg gswy daqr";

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccount, password);
            }
        });

        Message message = prepareMessage(session,myAccount,receipt);
        Transport.send(message);
        System.out.println("Message Sent Successfully.");
    }

    // send email with verification code
    public static void sendMailForValidation(String receipt) throws Exception{

        System.out.println("Mail Send Preparing.");

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccount = "ireshdilshan46@gmail.com";
        String password = "xuhk xtxg gswy daqr";

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccount, password);
            }
        });

        Message message = prepareVerificationEmailForChangePassword(session,myAccount,receipt);
        Transport.send(message);
        System.out.println("Message Sent Successfully.");
    }
    // this is registration email body
    private static Message prepareMessage(Session session, String myAccount, String receipt) throws Exception {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAccount));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receipt));
        message.setSubject("WELCOME TO NOVEL NOOK");
        message.setText("Hello Iresh Dilshan.I m CEo in the SO2 company.\nwe will decide you for get our president ship");
        return message;
    }
    // this is verfication email body
    public static int code;

    private static Message prepareVerificationEmailForChangePassword(Session session, String myAccount, String receipt) throws Exception {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAccount));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receipt));
        message.setSubject("RESET MY PASSWORD VERIFICAION");
        // generate 6 digit verification code
        code = 0;
        while (true){
            Random rand = new Random();
            code = rand.nextInt(999999);
            if(code > 100000){
                message.setText("Your Verification code is here.\n\n"+String.valueOf(code));
                return message;
            }
        }
    }
}
