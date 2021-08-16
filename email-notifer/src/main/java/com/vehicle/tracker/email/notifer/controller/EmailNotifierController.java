/**
 * 
 */
package com.vehicle.tracker.email.notifer.controller;


import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.tracker.email.notifer.service.EmailService;
/**
 * @author lika
 *
 */
@RestController
public class EmailNotifierController {

	@Autowired
	EmailService emailService;
	Logger log = org.apache.logging.log4j.LogManager.getLogger(EmailNotifierController.class);
	
	   @RequestMapping(value = "/sendNotification")
	   public void sendNotifier(@RequestParam("email") String email,@RequestParam("vehicleNumbers") List<String> list)  {
		  
		   
		   try {
			   log.info("/email-notifer :: EmailNotifierController -> going to send the email to :: "+email);
			emailService.sendEmailNotification(email,list);
			 log.info("/email-notifer :: Email sent to  ->>"+email);
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} 
		   
	   }   
}