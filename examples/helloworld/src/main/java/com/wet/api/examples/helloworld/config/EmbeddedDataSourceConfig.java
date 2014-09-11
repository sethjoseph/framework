package com.wet.api.examples.helloworld.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.wet.api.examples.helloworld.service.MessageService;
import com.wet.api.examples.helloworld.service.impl.HelloMessageService;

@Configuration
@ComponentScan(value={"com.wet.api.examples.helloworld"})
public class EmbeddedDataSourceConfig 
{
	@Bean
    public DataSource referenceDataSource() throws NamingException {
    	System.out.println("################################Starting reference-data referenceDataSource");
        EmbeddedDatabase db = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScripts("reference-data-schema.sql") // need to add reference-data-test-data.sql for unit test only
                .build();
        System.out.println("################################Finished reference-data referenceDataSource");
        
        if (db == null)
        {
        	System.out.println("DB is null");
        }
        else
        {
        	System.out.println("DB is not null");
        }
        return db;
    }
	
	@Bean
	public MessageService getMessageService()
	{
		return new HelloMessageService();
	}
}