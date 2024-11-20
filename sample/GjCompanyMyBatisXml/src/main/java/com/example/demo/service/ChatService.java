package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Chat;

public interface ChatService {
	//create
	void AddChat(Chat c);
	
	List<Chat> AllChat();
	
	
	void UpdateChat(Chat c);
	
	
	void DeleteChat(int id);

}
