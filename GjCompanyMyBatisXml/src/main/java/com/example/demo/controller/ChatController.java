package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Chat;
import com.example.demo.service.impl.ChatServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("chat")
public class ChatController {
	@Autowired
	ChatServiceImpl chatserviceimpl;
	
	@GetMapping("AllChat")
	public List<Chat> AllChat() {
		return chatserviceimpl.AllChat();
				
	}
	
	@PostMapping("AddChat")
	public String AddChat(@RequestBody Chat c) {
		chatserviceimpl.AddChat(c);
		return "建檔成功";
	}
	
	@PutMapping("UpdateChat")
	public String UpdateChat(@RequestBody Chat c) {
		chatserviceimpl.UpdateChat(c);
		return "修改成功";
	}
	
	@DeleteMapping("DeleteChat/{id}")
	public String Delete(@PathVariable("id") int id) {
		chatserviceimpl.DeleteChat(id);
		return "刪除成功";
	}
}
