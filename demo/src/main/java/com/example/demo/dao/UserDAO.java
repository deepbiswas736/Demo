package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Article;
import com.example.demo.entity.User;

@Transactional
@Repository
public class UserDAO implements IUserDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		String hql = "FROM User as u ORDER BY u.userId";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public User getUserByUsername(String username) {
		return entityManager.find(User.class, username);
	}
	

	@Override
	public User getUserById(int userId) {
		return entityManager.find(User.class, userId);

	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void updateUser(User user) {
		User user2 = getUserById(user.getUserId());
		user2.setUserName(user.getUserName());
		user2.setPassword(user.getPassword());
		entityManager.flush();
	}

	@Override
	public void deleteUser(int userId) {
		entityManager.remove(getUserById(userId));	
	}

	@Override
	public List<Article> getArticleByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> getArticleByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
