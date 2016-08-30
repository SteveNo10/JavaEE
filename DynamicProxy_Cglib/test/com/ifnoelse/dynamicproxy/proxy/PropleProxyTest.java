package com.ifnoelse.dynamicproxy.proxy;

import org.junit.Test;

import com.ifnoelse.dynamicproxy.dao.PeopleImpl;

public class PropleProxyTest {

	@Test
	public void test() {
		PeopleImpl peopleImpl = new PeopleImpl();
		PeopleProxy peopleProxy = new PeopleProxy();
		PeopleImpl temp = (PeopleImpl)peopleProxy.getInstance(peopleImpl);
		temp.eat();
	}

}
