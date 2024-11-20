package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ChatMapper;
import com.example.demo.model.Chat;
import com.example.demo.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{
	@Autowired
	ChatMapper chatmapper;
	
	@Override
	public void AddChat(Chat c) {
		chatmapper.addChat(c);
		
	}

	@Override
	public List<Chat> AllChat() {
		// TODO Auto-generated method stub
		return chatmapper.selectAll();
	}

	@Override
	public void UpdateChat(Chat c) {
		List<Chat> l=chatmapper.selectById(c.getId());
		Chat chat=l.get(0);
		chat.setSubject(c.getSubject());
		chat.setContent(c.getContent());
		chatmapper.update(chat);
		
	}

	@Override
	public void DeleteChat(int id) {
		chatmapper.deleteById(id);
		
	}

}
