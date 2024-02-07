package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.entity.EmailDetail;
import com.mail.service.EmailServiceImpl;

@RestController

public class MailController {
	@Autowired
	EmailServiceImpl emailservice;
	
	@RequestMapping("welcome")
	public String welcome()
	{
		return "Welcome Mail Api";
	}
  
	@PostMapping("/sendemail")
	public String sendMail(@RequestBody EmailDetail emaildeDetail)
	{
		String status=emailservice.sendSimpleEmail(emaildeDetail);
		return status;
		
	}
}
