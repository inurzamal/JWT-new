package com.nur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nur.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserName(String username);

}
