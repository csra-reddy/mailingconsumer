package com.docker.mailingconsumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicListener {

	@KafkaListener(topics = {"packaging_mailing_topic"}, groupId = "mail-group")
	public void handleSendingEmail(Mail mail) {
		System.out.println("Preparing to send shipping info to this email [" + mail.getEmail() + "]");
		System.out.println("Shipping Information");
		System.out.println(mail);
	}
}