package com.ifnoelse.struts2;

public class User {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User" + age;
	}
}
