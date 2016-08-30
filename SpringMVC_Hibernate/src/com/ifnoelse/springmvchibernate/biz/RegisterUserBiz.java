package com.ifnoelse.springmvchibernate.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ifnoelse.springmvchibernate.ibiz.IRegisterUserBiz;
import com.ifnoelse.springmvchibernate.idao.IUserDao;
import com.ifnoelse.springmvchibernate.model.User;

@Component
@Transactional
public class RegisterUserBiz implements IRegisterUserBiz {
	
	@Autowired
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean isExist(String username) {
		User user = userDao.queryUserByUsername(username);
		return user!=null;
	}

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}

}
