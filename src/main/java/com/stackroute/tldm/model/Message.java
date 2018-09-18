package com.stackroute.tldm.model;

import java.io.Serializable;
import java.util.Date;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.DataType;

@Table("Messages")
public class Message implements Serializable {

	@PrimaryKey
	@CassandraType(type = DataType.Name.TEXT)
	private String messageId;
	private String messageContent;
	@CassandraType(type = DataType.Name.UDT, userTypeName = "user")

	private User sender;
	@CassandraType(type = DataType.Name.UDT, userTypeName = "user")

	private User receiver;
	private Date createdAt;

	public Message() {
		super();
	}

	public Message(String messageContent) {
		this.messageContent = messageContent;
	}

	public Message(String messageId, String messageContent, User sender, User receiver, Date createdAt) {
		this.messageId = messageId;
		this.messageContent = messageContent;
		this.sender = sender;
		this.receiver = receiver;
		this.createdAt = createdAt;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Message{" + "messageId='" + messageId + '\'' + ", messageContent='" + messageContent + '\''
				+ ", sender=" + sender + ", receiver=" + receiver + ", createdAt=" + createdAt + '}';
	}
}
