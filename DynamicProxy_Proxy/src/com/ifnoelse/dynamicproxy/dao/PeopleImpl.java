package com.ifnoelse.dynamicproxy.dao;

import com.ifnoelse.dynamicproxy.idao.IPeople;

public class PeopleImpl implements IPeople {

	@Override
	public void eat() {
		System.out.println("people eat something...");
	}

}
