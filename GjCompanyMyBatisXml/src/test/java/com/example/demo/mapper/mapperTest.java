package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Chat;

@SpringBootTest
public class mapperTest {
	@Autowired
	ChatMapper chatmapper;
	
	@Test
	public void ctest() {
		//System.out.println(chatmapper.selectAll());
		//chatmapper.addChat(new Chat("aa","bb","cc"));
		//System.out.println(chatmapper.selectById(1));
		//System.out.println(chatmapper.selectByIdRange(7, 10));
		/*List<Chat> l=chatmapper.selectById(10);
		Chat c=l.get(0);
		c.setName("KKKK");
		chatmapper.update(c);*/
		chatmapper.deleteById(9);
		System.out.println("success");
	}
}
