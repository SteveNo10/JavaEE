package com.ifnoelse.spring.hibernate.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ifnoelse.spring.hibernate.idao.IUserDAO;
import com.ifnoelse.spring.hibernate.model.User;

@Component
@Transactional
public class UserManager {
	@Autowired
	private IUserDAO userDAO;

	public void add(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userDAO.add(user);
	}
	
	public void del(Integer id) {
		userDAO.del(userDAO.queryById(id));
	}
	
	public User queryUserById(Integer id) {
		return userDAO.queryById(id);
	}
	
	public void update(Integer id, String username, String password) {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		userDAO.update(user);
	}
}
