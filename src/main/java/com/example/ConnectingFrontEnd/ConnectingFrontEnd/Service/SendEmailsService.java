package com.example.ConnectingFrontEnd.ConnectingFrontEnd.Service;

import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.request.EmailRequest;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.response.EmailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


public interface SendEmailsService {
    EmailResponse sendMailMessage(EmailRequest emailRequest);
}
