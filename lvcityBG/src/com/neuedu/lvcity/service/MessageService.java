package com.neuedu.lvcity.service;


import java.util.List;
import java.util.Map;

import com.neuedu.lvcity.model.Message;

public interface MessageService {

	public int MessageCount();
	public List<Message> findAllMessage(Map<String, Object> map);
	public int addMessage(int mid,String tel,String sex,String name,String message);
	public int updateMessage(Message message);
	public int deleteMessage(Message message);
	public Message findOneMessage(Message message);
}
