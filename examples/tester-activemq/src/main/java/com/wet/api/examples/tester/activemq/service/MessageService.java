package com.wet.api.examples.tester.activemq.service;

public class MessageService 
{
	public void runMessageService(Runnable runnableMessage)
	{
		Thread brokerThread = new Thread(runnableMessage);
		brokerThread.setDaemon(false);
	    brokerThread.start();
	}
}