package com.bank.transactions;

import com.bank.accounts.Account;

public class DepositTransaction 
{
	public void deposit(Account toAcc , double amount)
	{
		if(toAcc.isActive())
		{
			System.out.println("Depositng Rs "+amount+" into the account having accnum "+toAcc.getAccNum());
			toAcc.setAccBal(toAcc.getAccBal()+amount);
		}
		else
		{
			System.out.println("Account is not active, cannot do any transaction");
		}
	}
}
