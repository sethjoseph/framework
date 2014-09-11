package com.myquest.api.examples.helloworld.config;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.myquest.api.examples.helloworld.service.MessageService;

@Configuration
@ComponentScan(basePackages = {"com.myquest.api.examples.helloworld"})
public class SpringConfig 
{
	@Inject
	MessageService messageService;
	
	@Inject
	DataSource referenceDataSource;
	
	public String getMessage()
	{
		return messageService.getMessage();
	}
	
	public DataSource getReferenceDataSource()
	{
		return referenceDataSource;
	}
}
