package com.yma.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yma.app.bean.User;
import com.yma.app.dao.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		userRepository.addUser(user);
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
}
