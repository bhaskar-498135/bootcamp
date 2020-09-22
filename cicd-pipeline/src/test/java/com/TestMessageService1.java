package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService1 {

	@Test
	public void testMessage() {
		MessageService2 ms = new MessageService2();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hi");
	
	}
	
	@Test
	public void testMessage1() {
		MessageService2 ms = new MessageService2();
		System.out.println("hello2");
		Assertions.assertEquals(ms.sayHello2(), "hi2");
	}
	
	@Test
	public void testMessage2() {
		MessageService2 ms = new MessageService2();
		System.out.println("hello3");
		Assertions.assertEquals(ms.sayHello3(), "hi3");
	}
	
	@Test
	public void testMessage3() {
		MessageService2 ms = new MessageService2();
		System.out.println("hello4");
		Assertions.assertEquals(ms.sayHello4(), "hi4");
	}
	
	@Test
	public void testMessage4() {
		MessageService2 ms = new MessageService2();
		System.out.println("hello5");
		Assertions.assertEquals(ms.sayHello5(), "hi5");
	}
	
}
