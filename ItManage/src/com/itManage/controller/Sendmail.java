package com.itManage.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Sendmail {

	
	public  static void mail(String email,String pname,String pdes,String name) {
		

		final String senderEmail="aravindkumark1997@gmail.com ";
		final String password="aravindkumark1997";
		Properties pro=new Properties();
		pro.put("mail.smtp.auth", "true");
		pro.put("mail.smtp.starttls.enable", "true");
		pro.put("mail.smtp.host", "smtp.gmail.com");
		pro.put("mail.smtp.port", "587");
		Session session=Session.getDefaultInstance(pro,new javax.mail.Authenticator()
				{
			
			    protected 	javax.mail.PasswordAuthentication getPasswordAuthentication()
			    {	
			    	return new javax.mail.PasswordAuthentication(senderEmail, password);
			    }
			
		
				}
				);
		
		
		
		
		try {
			System.out.println("mail sent");
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress("aravindkumark1997@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
			message.setSubject("New Project");
			message.setText(" Project Name:"+pname+" \nProject Description:"+pdes+"\nAdded By:"+name+"");
		//	message.setText("");
			//message.setText("Added By:"+name+"");
			Transport.send(message);
			System.out.println("done");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
			// TODO: handle exception 
		}
		
	}
	

}
