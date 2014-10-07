package com.wet.api.examples.simple.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Example model object - Bank Things (eg: Bank Payments, Card Accounts, etc.) Write your own model objects.
 *  
 */
public class BankThing implements Serializable
{
	private static final long serialVersionUID = -1030146444352680442L;
	
	// The id of the BankThing. Only available after a bank thing has been created
    private String id;
    
    @NotNull
    // The name of the BankThing
    private String name;

    // The amount of this monetary value
    private BigDecimal amount;
    
    // Whether BankThing is active
    private boolean active = true;

    // Whether BankThing is disabled
    private boolean disabled = false;

    // Getters and setters
	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public BigDecimal getAmount() 
	{
		return amount;
	}

	public void setAmount(BigDecimal amount) 
	{
		this.amount = amount;
	}

	public boolean isActive() 
	{
		return active;
	}

	public void setActive(boolean active) 
	{
		this.active = active;
	}

	public boolean isDisabled() 
	{
		return disabled;
	}

	public void setDisabled(boolean disabled) 
	{
		this.disabled = disabled;
	}
	
	 @Override
	 public String toString() 
	 {
		 return ToStringBuilder.reflectionToString(this);
	 }
	
	 @Override
	 public boolean equals(Object rhs) 
	 {
		 return EqualsBuilder.reflectionEquals(this, rhs, false);
	 }
    
	 @Override
	 public int hashCode() 
	 {
		 return HashCodeBuilder.reflectionHashCode(this, false);
	 }
}