package com.example.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.service.RegsiterEmailServiceInterface;
import com.example.model.registerEmail;
@Service
public class RegisterEmailService implements RegsiterEmailServiceInterface{
	 @Autowired private JavaMailSender javaMailSender;
	 @Value("${spring.mail.username}") private String sender;
	  public RegisterEmailService(JavaMailSender javaMailSender) {
	        this.javaMailSender = javaMailSender;
	    }
	// To send a simple email
	    public boolean sendSimpleMail(registerEmail details)
	    {
	        // Try block to check for exceptions
	        try {
	            // Creating a simple mail message
	       
	            MimeMessage mimeMessage =javaMailSender.createMimeMessage();
	            MimeMessageHelper msghelper = new MimeMessageHelper(mimeMessage, "utf-8");
	            // Setting up necessary details
	            msghelper.setFrom(sender);
	            System.out.println(details.getRecipient());
	            msghelper.setTo(details.getRecipient());
	            msghelper.setText(details.getMsgBody(),true);
	            msghelper.setSubject(details.getSubject());
	 
	            // Sending the mail
	            javaMailSender.send(mimeMessage);
	            return true;
	        }
	 
	        // Catch block to handle the exceptions
	        catch(Exception e) {
	        	System.out.println(e.getMessage());
	        	return false;
	        	}
	    }
}
