package com.example.userList.bootstrapData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.userList.model.User;
import com.example.userList.repository.UserRepository;

@Component
public class BooststrapData implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("Mario", "Rossi");
		User user2 = new User("Giorgio", "Rossi");
		
		userRepository.save(user1);
		userRepository.save(user2);
	}

}
