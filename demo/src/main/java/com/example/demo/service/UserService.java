package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	List<User> getAll();
	User add(User user);
	User edit(User user);
	void remove(Integer id);
}
