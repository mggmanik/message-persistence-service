package com.stackroute.tldm.service;

import com.stackroute.tldm.model.Message;

public interface MessagePersistenceService {
	
	void saveMessage(Message message);

}
