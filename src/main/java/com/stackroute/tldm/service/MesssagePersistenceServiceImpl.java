package com.stackroute.tldm.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.tldm.model.Message;
import com.stackroute.tldm.repository.MessagePersistenceRepository;

@Service
public class MesssagePersistenceServiceImpl implements MessagePersistenceService {
	
	private MessagePersistenceRepository messagePersistRepository;

	@Autowired
    public MesssagePersistenceServiceImpl(MessagePersistenceRepository messagePersistRepository) {
		super();
		this.messagePersistRepository = messagePersistRepository;
	}

	@Override
    public void saveMessage(Message message) {
        message.setCreatedAt(new Date());
        messagePersistRepository.save(message);
    }

}
