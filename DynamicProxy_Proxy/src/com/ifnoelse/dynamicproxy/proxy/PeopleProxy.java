package com.ifnoelse.dynamicproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PeopleProxy implements InvocationHandler {
	private Object target;
	
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				this);
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		Object result = null;
		System.out.println(arg1.getName() + "invoke begin");
		result = arg1.invoke(target, arg2);
		System.out.println(arg1.getName() + "invoke end");
		return result;
	}

}
