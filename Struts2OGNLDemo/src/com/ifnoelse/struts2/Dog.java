package com.ifnoelse.struts2;

public class Dog {
	private String name = "noname";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "a dog named " + name;
	}
}
