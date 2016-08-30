package com.ifnoelse.struts2;

public class Cat {
	private Dog friend;

	public Dog getFriend() {
		return friend;
	}

	public void setFriend(Dog friend) {
		this.friend = friend;
	}
	
	public String MiaoMiao() {
		return "miaomiao";
	}
	
	@Override
	public String toString() {
		return "This is a cat with friend " + friend;
	}
}
