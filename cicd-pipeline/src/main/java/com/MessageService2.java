package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService2 {
	
	@GetMapping("/hi")
	public String sayHello() {
		return "hi";
	}
		
		@GetMapping("/hi2")
		public String sayHello2() {
			return "hi2";
		}
			@GetMapping("/hi3")
			public String sayHello3() {
				return "hi3";
			}
			
			@GetMapping("/hi4")
			public String sayHello4() {
				return "hi4";
			}
			
			@GetMapping("/hi5")
			public String sayHello5() {
				return "hi5";
			}
	}


