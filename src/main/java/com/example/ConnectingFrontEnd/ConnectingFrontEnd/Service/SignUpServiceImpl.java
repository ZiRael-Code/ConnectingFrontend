package com.example.ConnectingFrontEnd.ConnectingFrontEnd.Service;

import com.example.ConnectingFrontEnd.ConnectingFrontEnd.FormData;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.request.EmailRequest;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.response.EmailResponse;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.model.User;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.repository.SignUpRepo;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class SignUpServiceImpl implements SignUpService{
    @Autowired
    SendEmails sendEmail;

    @Autowired
    private SignUpRepo sign;


    @Override
    public EmailResponse Signup(FormData formData){
        User user = new User();
        user.setUsername(formData.getUsername());
        user.setEmail(formData.getEmail());
        EmailRequest request = new EmailRequest(user.getEmail(), user.getUsername());
        EmailResponse emailResponse = sendEmail.sendMailMessage(request);
        if (emailResponse.isSuccess()){
        sign.save(user);
        return emailResponse;
        }throw new RuntimeException(emailResponse.getMessage());
    }

    public static void main(String[] args)  {
                String from = "oladejoisreal274@gmail.com";
                String password = "Semicolon;";

                String to = "oladejoisreal274@gmail.com";

                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                Session session = Session.getInstance(props,
                        new Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(from, password);
                            }
                        });

                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(from));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(to));
                    message.setSubject("Testing JavaMail API");
                    message.setText("Hello, this is a test email from JavaMail API.");
                    Transport.send(message);
                    System.out.println("Email sent successfully.");

                } catch (MessagingException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
                }
        }







