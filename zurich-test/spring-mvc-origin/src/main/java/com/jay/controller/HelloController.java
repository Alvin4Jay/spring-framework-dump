package com.jay.controller;

import com.jay.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuanjian
 */
@RestController
@RequestMapping("/hello/api/v1")
public class HelloController {

	@GetMapping("/hi")
	public String sayHello() {
		return "Hi";
	}

	@GetMapping("/user")
	public User getUser() {
		User user = new User();
		user.setName("jay");
		user.setId(26);
		return user;
	}

}