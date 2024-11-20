package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Chat;

@SpringBootTest
public class ChatTest {
	@Autowired
	ChatMapper chatmapper;
	
	@Test
	public void ctest()
	{
		
		//System.out.println(chatmapper.selectById(1));
		
		//chatmapper.addChat(new Chat("aa","bb","cc"));
		//System.out.println(chatmapper.selectByIdRange(1, 6));
		
		/*List<Chat> l=chatmapper.selectById(1);
		Chat c=l.get(0);
		c.setName("yyyyy");
		
		chatmapper.update(c);*/
		chatmapper.deleteById(34);
		System.out.println("success");
	}

}
