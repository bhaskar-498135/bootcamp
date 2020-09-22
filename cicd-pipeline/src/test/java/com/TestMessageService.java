package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	
	}
	
	@Test
	public void testMessage1() {
		MessageService ms = new MessageService();
		System.out.println("hello2");
		Assertions.assertEquals(ms.sayHello2(), "hello2");
	}
	
	@Test
	public void testMessage2() {
		MessageService ms = new MessageService();
		System.out.println("hello3");
		Assertions.assertEquals(ms.sayHello3(), "hello3");
	}
	
	@Test
	public void testMessage3() {
		MessageService ms = new MessageService();
		System.out.println("hello4");
		Assertions.assertEquals(ms.sayHello4(), "hello4");
	}
	
	@Test
	public void testMessage4() {
		MessageService ms = new MessageService();
		System.out.println("hello5");
		Assertions.assertEquals(ms.sayHello5(), "hello5");
	}
	
}
