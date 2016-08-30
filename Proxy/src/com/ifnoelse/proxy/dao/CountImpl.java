package com.ifnoelse.proxy.dao;

import com.ifnoelse.proxy.idao.ICount;

public class CountImpl implements ICount {

	@Override
	public void queryCount() {
		System.out.println("queryCount...");
	}

	@Override
	public void updateCount() {
		System.out.println("updateCount...");
	}

}
