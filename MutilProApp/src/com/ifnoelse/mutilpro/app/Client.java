package com.ifnoelse.mutilpro.app;

import com.ifnoelse.mutilpro.core.Service;

public class Client {

	public static void main(String[] args) {
		Service service = new Service();
		System.out.println(service.getMessge());
	}

}
