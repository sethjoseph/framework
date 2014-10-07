package com.wet.api.examples.simple.service.api;

import com.wet.api.examples.simple.model.BankThing;

/**
 * Service for manipulating BankThings.
 * 
 */
public interface BankThingService 
{
    /**
     * Find a specific {@BankThing}.
     *
     * @param id The id of the BankThing to search for
     * @return The found BankThing (or null)
     */
    BankThing findBankThing(String id);

    /**
     * Create a {@BankThing}.
     *
     * @param bankThing The {@BankThing} to create
     * @return The created {@BankThing}
     */
    BankThing create(BankThing bankThing);

    /**
     * Update a {@BankThing}
     *
     * @param bankThing The {@BankThing} to update
     * @return The updated {@BankThing}
     */
    BankThing update(BankThing bankThing);

    /**
     * Delete a {@BankThing}
     *
     * @param id The id of the {@BankThing} to delete
     */
    void delete(String id);
}