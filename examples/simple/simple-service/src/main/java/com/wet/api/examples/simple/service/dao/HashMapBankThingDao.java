package com.wet.api.examples.simple.service.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.ConversionService;

import com.wet.api.examples.simple.model.BankThing;

@Named
public class HashMapBankThingDao implements BankThingDao 
{
	private HashMap<String, String> bankThings = new LinkedHashMap<String, String>();
	
	@Inject
    private ConversionService conversionService;
	
	@Override
	public BankThing retrieve(String id) 
	{
		String json = bankThings.get(id);
        if (StringUtils.isNotEmpty(json)) 
        {
            return conversionService.convert(json, BankThing.class);
        }
        //TODO: Exception handling using proprietary NotFoundException
        throw new RuntimeException("notFound");
	}

	@Override
	public List<BankThing> retrieveAll() 
	{
		return Arrays.asList(conversionService.convert(bankThings.values().toArray(new String[0]), BankThing[].class));
	}

	@Override
	public void delete(String id) 
	{
		bankThings.remove(id);
	}

	@Override
	public BankThing save(BankThing thing) 
	{
		bankThings.put(thing.getId(), conversionService.convert(thing, String.class));
        return thing;
	}
}