package com.ifnoelse.ssh.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ifnoelse.ssh.dao.UserDAO;
import com.ifnoelse.ssh.model.User;

@Component
@Transactional
public class UserBiz {
	
	@Autowired
	private UserDAO userDao;
	
	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public boolean IsExist(String username) {
		User user = userDao.GetUserByUsername(username);
		if (user!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void Save(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userDao.Save(user);
	}
}
