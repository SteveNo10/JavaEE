package com.ifnoelse.spring.jdbc.idao;

import java.util.List;

import com.ifnoelse.spring.jdbc.model.User;

public interface IUserDAO {
	public void add(User user);
	public void update(User user);
	public User query(String username);
	List<String> queryAllUsername();
	String queryUsernameById(int id);
	List<User> queryUsersByIds(List<Integer> ids);
	Integer queryTotalCount();
}
