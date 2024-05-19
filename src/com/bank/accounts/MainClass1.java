package com.bank.accounts;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		AccountCreation ac = new AccountCreation();
		AccountClose ac1 = new AccountClose();
		
		Account a1 = ac.createAccount("K.GUNASHEKAR", "CURRENT" , 25489990.00);
		System.out.println(a1.getAccNum());
		
		Account a2 = ac.createAccount("RAHUL.H.N", "SAVINGS", 25000.00);
		System.out.println(a2.getAccNum());
		
		System.out.println(a1.isActive());
		System.out.println(a2.isActive());
		
		ac1.deactivate(a2);
		System.out.println(a2.isActive());
		
	}
}
