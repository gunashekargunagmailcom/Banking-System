package com.bank.accounts;

public class AccountCreation 
{
	private static int initAccNum=10001;
	
	// java docs
	
	/**
	 * 	this method is used to create account based on the given parameters
	 * @param custname
	 * @param acctype
	 * @param accbal
	 * @return Account type object
	 */
	
	public Account createAccount(String custname, String acctype, double accbal)
	{
		System.out.println("Creating an account");
		return new Account(initAccNum++, accbal, custname, acctype, true);
	}
}
