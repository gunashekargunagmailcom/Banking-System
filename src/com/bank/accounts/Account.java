package com.bank.accounts;

public class Account 
{
	
	//@entity annotation
	
	private final int accNum;
	private double accBal;
	private String custName;
	private String accType;
	private boolean active;
	
	public Account(int accNum, double accBal, String custName, String accType, boolean active) 
	{
		super();
		this.accNum = accNum;
		this.accBal = accBal;
		this.custName = custName;
		this.accType = accType;
		this.active = active;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getAccNum() {
		return accNum;
	}
	
	
	
	
}
