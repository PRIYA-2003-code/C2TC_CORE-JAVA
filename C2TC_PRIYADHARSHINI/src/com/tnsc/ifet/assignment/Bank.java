package com.tnsc.ifet.assignment;

public class Bank {
	private static int totalAccount=0;
	public Bank() {
		totalAccount++;
	}
	public static int getTotalAccounts() {
		return totalAccount;
	}
	public static void main(String[] args) {
		Bank account1=new Bank();
		Bank account2=new Bank();
		Bank account3=new Bank();
		System.out.println("Total bank accounts created:"+Bank.getTotalAccounts());
		
	}

}
