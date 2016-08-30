package com.ifnoelse.springmvchibernate.ibiz;

import com.ifnoelse.springmvchibernate.model.User;

public interface IRegisterUserBiz {
	public boolean isExist(String username);
	public void addUser(User user);
}
