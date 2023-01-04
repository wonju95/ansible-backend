package com.user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.domain.User;
import com.user.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User getUserInfo(String userId, String passwd) {
		
		return userRepository.findByIdAndPasswd(userId, passwd);
	}
}
