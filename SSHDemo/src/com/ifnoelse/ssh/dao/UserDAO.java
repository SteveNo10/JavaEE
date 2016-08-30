package com.ifnoelse.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ifnoelse.ssh.model.User;

@Component
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public User GetUserByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		List<User> users = session.createQuery("select u from User u where u.username=:username", User.class).setParameter("username", username).getResultList();
		if (users.isEmpty()) {
			return null;
		}
		else {
			return users.get(0);
		}
	}
	
	public void Save(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
}
