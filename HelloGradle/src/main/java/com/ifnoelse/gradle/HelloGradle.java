package com.ifnoelse.gradle;

import org.apache.log4j.Logger;

public class HelloGradle {
	
	private static final Logger LOGGER = Logger.getLogger(HelloGradle.class);

	public static void main(String[] args) {
		MessageService messageService = new MessageService();
		String message = messageService.getMessage();
		LOGGER.info("Receive message" + message);
	}

}
