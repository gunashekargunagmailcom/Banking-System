package com.bank.accounts;

public class AccountClose 
{	

	/**
	 * deactivate the given Account
	 * @param a1 -> Account to be deactivated
	 */
	
	public void deactivate(Account a1)
	{
		System.out.println("Deactivating the account");
		a1.setActive(false);
	}
}
