package com.bank;

import com.bank.accounts.Account;
import com.bank.accounts.AccountClose;
import com.bank.accounts.AccountCreation;
import com.bank.transactions.DepositTransaction;

public class StartBankApp 
{
	public static void main(String[] args) 
	{
		
		AccountCreation ac = new AccountCreation();
		AccountClose ac1 = new AccountClose();
		DepositTransaction dt = new DepositTransaction();
		
		Account a1 = ac.createAccount("K.GUNASHEKAR", "CURRENT" , 25489990.00);
		Account a2 = ac.createAccount("RAHUL.H.N", "SAVINGS", 25000.00);
		
		System.out.println("Before Deposit acc bal : "+a1.getAccBal());
		dt.deposit(a1, 5000.00);
		System.out.println("After Deposit acc bal : "+a1.getAccBal());
		
		System.out.println("Before Deposit acc bal : "+a2.getAccBal());
		dt.deposit(a2, 10000.00);
		System.out.println("After Deposit acc bal : "+a2.getAccBal());
		
	}
}
