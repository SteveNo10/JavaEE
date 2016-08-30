package com.ifnoelse.spring.jdbc.biz;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ifnoelse.spring.jdbc.model.User;

public class UserManagerTest {

	private static UserManager userManager;
	private static ApplicationContext applicationContext;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		userManager = applicationContext.getBean("userManager", UserManager.class);
	}
	
	@Test
	public void testAdd() {
		userManager.add("eee", "eee");
	}

	@Test
	public void testUpdate() {
		userManager.update(3, "ccc", "ccc");
	}

	@Test
	public void testQuery() {
		User user = userManager.query("bbb");
		System.out.println(user);
	}

	@Test
	public void testGetAllUsernames() {
		List<String> usernames = userManager.getAllUsernames();
		for (String username : usernames) {
			System.out.println(username);
		}
	}

	@Test
	public void testGetUsernameById() {
		String userName = userManager.getUsernameById(1);
		System.out.println(userName);
	}
	
	@Test
	public void testGetUsersByIds() {
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		List<User> users = userManager.getUsersByIds(ids);
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testGetTotalCount() {
		System.out.println("total count:" + userManager.getTotalCount());
	}

}
