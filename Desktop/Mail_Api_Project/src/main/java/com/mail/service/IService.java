package com.mail.service;

import com.mail.entity.EmailDetail;

public interface IService {

	public String sendSimpleEmail(EmailDetail emaildetail);
	public void sendEmailWithAttachment(EmailDetail emaildetail);
}
