package com.stackroute.tldm.consumer;

import com.stackroute.tldm.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

//    Autowire service-impl here

    @KafkaListener(topics = "${topic.boot}")
    public void receive(@Payload Message message) {
//        add the code to save messages in cassandra using service-impl class
        System.out.println("Message:" + message);
    }
}
