package com.example.demo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.reponsitory.UserReponsitory;
import com.example.demo.service.UserService;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserReponsitory userReponsitory;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userReponsitory.findAll();
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return userReponsitory.save(user);
	}

	@Override
	public User edit(User user) {
		// TODO Auto-generated method stub
		return userReponsitory.save(user);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		userReponsitory.deleteById(id);
	}
}
