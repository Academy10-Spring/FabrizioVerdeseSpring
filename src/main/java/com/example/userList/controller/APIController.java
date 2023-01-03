package com.example.userList.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.userList.model.User;
import com.example.userList.repository.UserRepository;

@RestController
@RequestMapping("api")
public class APIController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value = "/addUser")
	public boolean addUser(@RequestParam Map<String, String> params) {
		try {
			User user = new User(params.get("nome"), params.get("cognome"));
			userRepository.save(user);
			return true;
		}
		catch (NumberFormatException e){
			e.printStackTrace();
		}
		
		System.out.println(params);
		return false;
	}

}
