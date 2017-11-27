package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface IUserService {
	
	List<User> getAllUser();
    User getUserById(int userId);
    User getUserByUsername(String userName);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    
}
