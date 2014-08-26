package com.myquest.api.examples.helloworld.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController 
{
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(Model model)
	{
		Date today = new Date();
		model.addAttribute("today", today);
		
		return "helloWorld";
	}
}
