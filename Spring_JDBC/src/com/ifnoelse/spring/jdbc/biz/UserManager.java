package com.ifnoelse.spring.jdbc.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ifnoelse.spring.jdbc.idao.IUserDAO;
import com.ifnoelse.spring.jdbc.model.User;

@Component
public class UserManager {
	@Autowired
	private IUserDAO userDAO;
	
	public void add(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userDAO.add(user);
	}
	
	public void update(int id, String username, String password) {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		userDAO.update(user);
	}
	
	public User query(String username) {
		return userDAO.query(username);
	}
	
	public List<String> getAllUsernames() {
		return userDAO.queryAllUsername();
	}
	
	public String getUsernameById(int id) {
		return userDAO.queryUsernameById(id);
	}
	
	public List<User> getUsersByIds(List<Integer> ids) {
		return userDAO.queryUsersByIds(ids);
	}
	
	public Integer getTotalCount() {
		return userDAO.queryTotalCount();
	}
}
