package com.tnsc.ifet.assignment;

public class BankApplication {
	public static void main (String[] args) {
		//creating saving account with initial balance  amount of 1000
		Account savings=new SavingAccount(1000);
		savings.deposit(500);
		savings.withdraw(300);
		savings.displayAccountInfo();
		System.out.println();
		//creating checking  account with initial balance amount of 1000
		Account checking=new CheckingAccount(1000);
		checking.deposit(200);
		checking.withdraw(150);
		checking.displayAccountInfo();
	}

}
