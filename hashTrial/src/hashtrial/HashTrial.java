/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtrial;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;
import javax.mail.Transport;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author eagui
 */
public class HashTrial {

    public static String sender = "eaguilaortiz0403@gmail.com";
    public static String passie = "fehkoxwfhvypflok";
    public static Session session;
    public static Properties properties;
    /**
     * @param args the command line arguments
     */
    //static String password = "sunshine";
    private static byte[] hash;

    public static void main(String[] args) throws NoSuchAlgorithmException, MessagingException {

        mandarCorreo();
    }

    public static void mandar() throws MessagingException {
        mandarCorreo();

       try{
            MimeMessage mail = new MimeMessage(session);
            
            mail.setFrom(new InternetAddress("eaguilaortiz0403@gmail.com"));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress("eaguilaortiz0403@gmail.com"));
            mail.setSubject("pruebita");
            mail.setText("pruebita maybe successful");
            
            Transport transporte = session.getTransport("smtp");
            transporte.connect("eaguilaortiz0403",passie);
            
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            JOptionPane.showMessageDialog(null,"Listo! Revise el correo");
        }catch(Exception ex){
            System.out.println("nega");
        }
        //session = Session.getInstance(properties, null);
    }

    public static void mandarCorreo() {
        // El correo gmail de envío
        properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        
        session = Session.getDefaultInstance(properties);

        session.setDebug(true);
        
        
        try{
            MimeMessage mail = new MimeMessage(session);
            
            mail.setFrom(new InternetAddress("eaguilaortiz0403@gmail.com"));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress("eaguilaortiz0403@gmail.com"));
            mail.setSubject("pruebita");
            mail.setText("pruebita maybe successful");
            
            Transport transporte = session.getTransport("smtp");
            transporte.connect("eaguilaortiz0403",passie);
            
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
          //  JOptionPane.showMessageDialog(this,"Listo! Revise el correo");
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
