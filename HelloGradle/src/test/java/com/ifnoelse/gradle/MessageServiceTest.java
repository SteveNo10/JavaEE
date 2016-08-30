package com.ifnoelse.gradle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MessageServiceTest {
	
	private MessageService messageService;

	@Before
	public void setUp() throws Exception {
		messageService = new MessageService();
	}

	@Test
	public void test() {
		assertEquals("Hello Gradle!", messageService.getMessage());
	}

}
