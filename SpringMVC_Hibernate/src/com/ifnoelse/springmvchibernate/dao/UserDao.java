package com.ifnoelse.springmvchibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ifnoelse.springmvchibernate.idao.IUserDao;
import com.ifnoelse.springmvchibernate.model.User;

@Component
public class UserDao implements IUserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User queryUserByUsername(String username) {
		List<User> users = sessionFactory
				.getCurrentSession()
				.createQuery("select u from user u where u.username=:username", User.class)
				.setParameter("username", username)
				.getResultList();
		if (users!=null && !users.isEmpty()) {
			return users.get(0);
		}
		return null;
	}

	@Override
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

}
