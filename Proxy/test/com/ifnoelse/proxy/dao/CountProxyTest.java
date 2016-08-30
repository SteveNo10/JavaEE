package com.ifnoelse.proxy.dao;

import org.junit.Test;

public class CountProxyTest {

	@Test
	public void test() {
		CountImpl countImpl = new CountImpl();
		CountProxy countProxy = new CountProxy(countImpl);
		countProxy.queryCount();
		countProxy.updateCount();
	}

}
