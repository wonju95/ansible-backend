package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.domain.User;
import com.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping(path = "/api/login")
	public User login(@RequestParam String userId, @RequestParam String passwd) {
		
		return userService.getUserInfo(userId, passwd);
	}
	
}
