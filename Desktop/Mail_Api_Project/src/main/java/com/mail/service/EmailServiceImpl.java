package com.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mail.entity.EmailDetail;
@Service
public class EmailServiceImpl implements IService  {

	@Autowired
	private JavaMailSender javamailsender;


	@Value("${spring.mail.username}")
	private String sender;

	@Override
	public String sendSimpleEmail(EmailDetail emaildetail) {
		try {
		SimpleMailMessage simple = new SimpleMailMessage();
		simple.setFrom(sender);
		simple.setSubject(emaildetail.getSubject());
		simple.setText(emaildetail.getText());
		simple.setTo(emaildetail.getTo());
		javamailsender.send(simple);
		return "mail sent successfully ";
		
		}
		catch(Exception e)
		{
			 return "not done";
	}
	}
	@Override
	public void sendEmailWithAttachment(EmailDetail emaildetail) {

	}

}
