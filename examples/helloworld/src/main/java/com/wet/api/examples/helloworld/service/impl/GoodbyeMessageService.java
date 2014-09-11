package com.wet.api.examples.helloworld.service.impl;

import com.wet.api.examples.helloworld.service.MessageService;

public class GoodbyeMessageService implements MessageService 
{
	@Override
	public String getMessage() 
	{
		return "Good Bye! ;)";
	}
}