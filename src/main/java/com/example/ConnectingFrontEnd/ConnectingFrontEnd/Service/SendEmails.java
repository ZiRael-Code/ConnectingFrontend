package com.example.ConnectingFrontEnd.ConnectingFrontEnd.Service;

import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.request.EmailRequest;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.response.EmailResponse;
import com.sendgrid.SendGrid;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.swing.text.AbstractDocument;
import java.io.IOException;
@Service
public class SendEmails implements SendEmailsService {
        @Autowired
        private JavaMailSender javaMailSender;
        @Override
        public EmailResponse sendMailMessage(EmailRequest emailRequest) {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            try {
                simpleMailMessage.setFrom("ojot630@gmail.com");
                simpleMailMessage.setTo(emailRequest.getEmail());
                simpleMailMessage.setSubject("Testing email sever");
                simpleMailMessage.setText("This email was sent successfully");
                javaMailSender.send(simpleMailMessage);
                return new EmailResponse("Mail sent successfully", true);
            }catch (Exception exception){
                return new EmailResponse(exception.getMessage(), false);
            }
        }
    }

