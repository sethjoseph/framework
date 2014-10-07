package com.wet.api.examples.simple.service.dao;

import java.util.List;

import com.wet.api.examples.simple.model.BankThing;

public interface BankThingDao 
{
	/**
     * Will retrieve a BankThing.
     * 
     * @param id Id of the BankThing to retrieve
     * 
     * @return The found BankThing
     */
    public BankThing retrieve(String id);

    /**
     * Retrieve all BankThings
     * 
     * @return A list of BankThings
     */
    public List<BankThing> retrieveAll();

    /**
     * Will delete a BankThing.
     * 
     * @param id Id of the BankThing to delete
     */
    public void delete(String id);

    /**
     * Will update a BankThing.
     * 
     * @param thing The BankThing to update
     * 
     * @return Updated BankThing.
     */
    public BankThing save(BankThing thing);
}