package com.wet.api.examples.helloworld.web;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wet.api.examples.helloworld.config.EmbeddedDataSourceConfig;
import com.wet.api.examples.helloworld.config.SpringConfig;

@Controller
public class HelloWorldController 
{	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(Model model)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmbeddedDataSourceConfig.class);
        SpringConfig springConfig = context.getBean(SpringConfig.class);
        
        String message = springConfig.getMessage();
        DataSource referenceDataSource = springConfig.getReferenceDataSource();
        
        String status = "Not null";
        
        if (referenceDataSource == null)
        {
        	status = "Is null";
        }
         
        //close the context
        context.close();
		
		Date today = new Date();
		model.addAttribute("today", today);
		model.addAttribute("message", message);
		model.addAttribute("referenceDataSource", status);
		
		return "helloWorld";
	}
}