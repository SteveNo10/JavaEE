package com.ifnoelse.spring.hibernate.idao;

import com.ifnoelse.spring.hibernate.model.User;

public interface IUserDAO {
	public void add(User user);
	public void del(User user);
	public void update(User user);
	public User queryById(Integer id);
}
