package com.wet.api.examples.tester.activemq.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wet.api.examples.tester.activemq.service.MessageApplication;
import com.wet.api.examples.tester.activemq.service.MessageService;
import com.wet.api.examples.tester.activemq.service.RunnableMessageConsumer;
import com.wet.api.examples.tester.activemq.service.RunnableMessageProducer;

@Controller
public class HelloWorldController
{
	private int cnt = 0;
	private Date today = new Date();
	private MessageService messageService = new MessageService();
	
	/**
	 * Notes:
	 * If I run the static runApplication, it seems to work as well as when I ran it in it's own separate application with a main function.
	 * For some reason, when breaking it out to separate class files, I can't get it to work the same when invoking the producer and consumer
	 * links directly. But perhaps this is good enough for what I'm trying to accomplish here. 
	 * 
	 * Only working with stand alone tomcat. And it doesn't even work all that well. Will see nulls in the log statements.
	 */
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(Model model) throws Exception
	{
		String message = "Hello World!!";
		
		model.addAttribute("today", today);
		model.addAttribute("message", message);
		model.addAttribute("count", cnt);
		
		MessageApplication.runApplication();
		
		return "helloWorld";
	}
	
	@RequestMapping(value="/inc", method=RequestMethod.GET)
	public String increment(Model model)
	{
		String message = "Incrementing Count!";
		model.addAttribute("today", today);
		model.addAttribute("message", message);	
		model.addAttribute("count", ++cnt);
		
		return "helloWorld";
	}
	
	@RequestMapping(value="/dec", method=RequestMethod.GET)
	public String decrement(Model model)
	{
		String message = "Decrementing Count!";
		model.addAttribute("today", today);
		model.addAttribute("message", message);
		model.addAttribute("count", --cnt);
		
		return "helloWorld";
	}
	
	@RequestMapping(value="/produce", method=RequestMethod.GET)
	public String produce(Model model)
	{
		String message = "Producing a message and adding to queue";
		model.addAttribute("today", today);
		model.addAttribute("message", message);
		model.addAttribute("count", cnt);
		
		RunnableMessageProducer producer = new RunnableMessageProducer();
		messageService.runMessageService(producer);
		//model.addAttribute("queueMessage", producer.getMessage());
		
		return "helloWorld";
	}
	
	@RequestMapping(value="/consume", method=RequestMethod.GET)
	public String consume(Model model)
	{
		String message = "Consuming a message from the queue";
		model.addAttribute("today", today);
		model.addAttribute("message", message);
		model.addAttribute("count", cnt);
		
		RunnableMessageConsumer consumer = new RunnableMessageConsumer();
		messageService.runMessageService(consumer);
		//model.addAttribute("queueMessage", consumer.getMessage());
		
		return "helloWorld";
	}
}