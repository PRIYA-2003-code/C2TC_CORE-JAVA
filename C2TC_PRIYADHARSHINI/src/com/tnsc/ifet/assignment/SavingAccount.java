package com.tnsc.ifet.assignment;

public class SavingAccount  extends Account{
	public SavingAccount(double initialBalance) {
		super(initialBalance);
	}
	@Override
	public void deposit(double amount)
	{
		balance += amount;
	}
	@Override
	public void withdraw(double amount)
	{
		balance -= amount;
	}

}

