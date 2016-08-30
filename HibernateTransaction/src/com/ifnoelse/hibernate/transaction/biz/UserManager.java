package com.ifnoelse.hibernate.transaction.biz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ifnoelse.hibernate.transaction.model.User;

public class UserManager {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void add(String username, String password) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		session.save(user);
		session.getTransaction().commit();
	}
}
