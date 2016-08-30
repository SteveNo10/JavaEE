package com.ifnoelse.proxy.dao;

import com.ifnoelse.proxy.idao.ICount;

public class CountProxy implements ICount {

	private CountImpl countImpl;
	
	public CountProxy(CountImpl countImpl) {
		this.countImpl = countImpl;
	}
	
	@Override
	public void queryCount() {
		System.out.println("before queryCount");
		countImpl.queryCount();
		System.out.println("after queryCount");
	}

	@Override
	public void updateCount() {
		System.out.println("before updateCount");
		countImpl.updateCount();
		System.out.println("after updateCount");
	}

}
