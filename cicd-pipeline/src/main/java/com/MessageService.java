package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
		
		@GetMapping("/hello2")
		public String sayHello2() {
			return "hello2";
		}
			@GetMapping("/hello3")
			public String sayHello3() {
				return "hello3";
			}
			
			@GetMapping("/hello4")
			public String sayHello4() {
				return "hello4";
			}
			
			@GetMapping("/hello5")
			public String sayHello5() {
				return "hello5";
			}
	}


