package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Article;
import com.example.demo.entity.User;

public interface IUserDAO {
	 	List<User> getAllUser();
	    User getUserById(int userId);
	    User getUserByUsername(String username);
	    void addUser(User user);
	    void updateUser(User user);
	    void deleteUser(int userId);
	    List<Article> getArticleByUserId(int userId);
	    List<Article> getArticleByUserName(String userName);
	    
}
