package com.wet.api.examples.helloworld.service.impl;

import com.wet.api.examples.helloworld.service.MessageService;

public class HelloMessageService implements MessageService 
{
	public String getMessage()
	{
		return "Hello :)";
	}
}