package com.ifnoelse.dynamicproxy.proxy;

import org.junit.Test;

import com.ifnoelse.dynamicproxy.dao.PeopleImpl;
import com.ifnoelse.dynamicproxy.idao.IPeople;

public class PeopleProxyTest {

	@Test
	public void test() {
		PeopleProxy peopleProxy = new PeopleProxy();
		IPeople people = (IPeople)peopleProxy.bind(new PeopleImpl());
		people.eat();
	}

}
