package com.project.ERapor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender sender;

    @Autowired
    public EmailService(JavaMailSender mailSender){
        this.sender = mailSender;
    }
    public String sendEmail(){
        MimeMessage message = sender.createMimeMessage();
        try{
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setTo("nushnna1953@gmail.com");
            helper.setText("Anda telah login ke Aplikasi E-Rapor saat ini.");
            helper.setSubject("Login Sukses");
            helper.setFrom("nushnna1953@gmail.com");
            sender.send(message);
        }catch (MessagingException e){
            e.printStackTrace();
        }return "response";
    }
}
