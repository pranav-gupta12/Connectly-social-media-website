package com.connectly.service;

import java.util.List;

import com.connectly.exception.ChatException;
import com.connectly.exception.MessageException;
import com.connectly.exception.UserException;
import com.connectly.model.Message;
import com.connectly.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
