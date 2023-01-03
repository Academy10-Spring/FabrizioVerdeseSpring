package com.example.userList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.userList.model.User;
import com.example.userList.repository.UserRepository;

@Controller
public class WebController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String getHome(Model model) {
		List<User> userList = (List<User>) userRepository.findAll();
		model.addAttribute("users", userList);
		return "home";
	}
	
	@GetMapping("/user")
	public String getFormUser() {
		return "user/form";
	}

}
