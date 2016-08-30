package com.ifnoelse.spring.hibernate.biz;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ifnoelse.spring.hibernate.model.User;

public class UserManagerTest {
	
	private static UserManager userManager;
	private static ApplicationContext applicationContext;
	//private static SessionFactory sessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		//sessionFactory = applicationContext.getBean("sessionFactory", SessionFactory.class);
		userManager = applicationContext.getBean("userManager", UserManager.class);
	}

	@Test
	public void testAdd() {
		userManager.add("aaa", "aaa");
	}

	@Test
	public void testUpdate() {
		userManager.update(1, "bbb", "ccc");
	}
	
	@Test
	public void testQueryUserById() {
		User user = userManager.queryUserById(1);
		System.out.println(user);
	}
	
	@Test
	public void testDel() {
		userManager.del(1);
	}

}
