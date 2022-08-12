package com.nur;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nur.entities.User;
import com.nur.repositories.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
	
	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "nur","zaman123","nur.nielit18@gmail.com"),
				new User(102, "user1","123","user1@gmail.com"),
				new User(103, "user2","12345","user2@gmail.com")
				).collect(Collectors.toList());
		
		repository.saveAll(users);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}
}
