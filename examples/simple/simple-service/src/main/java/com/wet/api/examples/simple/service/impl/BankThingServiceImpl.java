package com.wet.api.examples.simple.service.impl;

import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

import com.wet.api.examples.simple.model.BankThing;
import com.wet.api.examples.simple.service.api.BankThingService;
import com.wet.api.examples.simple.service.dao.BankThingDao;

@Named
public class BankThingServiceImpl implements BankThingService 
{
	private static final int MAX = 50;
    private static final int MIN = 3;

    private Random random = new Random();
    
	@Inject
    private BankThingDao bankThingDao;
	
	@Override
	public BankThing findBankThing(String id) 
	{
		return bankThingDao.retrieve(id);
	}

	@Override
	public BankThing create(BankThing bankThing) 
	{
		bankThing.setId(Integer.toString(random.nextInt((MAX - MIN) + 1) + MIN));
        return bankThingDao.save(bankThing);
	}

	@Override
	public BankThing update(BankThing bankThing) 
	{
		return bankThingDao.save(bankThing);
	}

	@Override
	public void delete(String id) 
	{
		bankThingDao.delete(id);
	}
}