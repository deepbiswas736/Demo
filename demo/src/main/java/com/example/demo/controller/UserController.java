package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;



@RestController
@RequestMapping("userModule")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@GetMapping("users")
	List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("user/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("users/{userName}")
	public User getUserByUserName(@PathVariable("userName") String userName) {
		return userService.getUserByUsername(userName);
	}
	
	@PostMapping("users")
	public void addUser(User user) {
		userService.addUser(user);
	}
	
	@PutMapping("users")
	public void updateUser(User user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("user/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);;
	}
}
