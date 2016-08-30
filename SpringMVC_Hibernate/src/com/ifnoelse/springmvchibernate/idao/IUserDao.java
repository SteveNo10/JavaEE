package com.ifnoelse.springmvchibernate.idao;

import com.ifnoelse.springmvchibernate.model.User;

public interface IUserDao {
	public User queryUserByUsername(String username);
	public void insertUser(User user);
}
