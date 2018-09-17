package com.stackroute.tldm.model;

import java.util.Date;

public class Message {

    private String messageId;
    private String messageContent;
    private User sender;
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
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", messageContent='" + messageContent + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", createdAt=" + createdAt +
                '}';
    }
}
