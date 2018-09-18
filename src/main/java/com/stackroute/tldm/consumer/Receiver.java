package com.stackroute.tldm.consumer;

import com.stackroute.tldm.model.Message;
import com.stackroute.tldm.service.MessagePersistenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

//    Autowire service-impl here
	MessagePersistenceService messagePersists;

	@Autowired
	public Receiver(MessagePersistenceService messagePersists) {
		super();
		this.messagePersists = messagePersists;
	}

	@KafkaListener(topics = "message_persist")
	public void receive(@Payload Message message) {
//        add the code to save messages in cassandra using service-impl class
		System.out.println("message is ::"+ message);
		messagePersists.saveMessage(message);
		System.out.println("Message:" + message);
	}
}
