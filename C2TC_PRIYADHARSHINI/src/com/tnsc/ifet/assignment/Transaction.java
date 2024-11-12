package com.tnsc.ifet.assignment;

public class Transaction {
	//Final variabe to represent a fixed transaction fees
	private final double transactionFee=2.50;
	//final method to perform transaction process
	public final void performanceTransaction(double amount) {
		if(amount<=0) {
			System.out.println("Invalid transaction amount ");
			
		}
		double totalAmount = amount + transactionFee;
        System.out.println("Transaction successful.");
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Fee: " + transactionFee);
        System.out.println("Total Amount Deducted: " + totalAmount);
    }
	// Getter for transactionFee to access the fee if needed
    public double getTransactionFee() {
        return transactionFee;
    }
    public static void main(String[] args) {
        // Create an instance of Transaction class
        Transaction transaction1 = new Transaction();

        // Perform a transaction
        transaction1.performanceTransaction(100.00);
    	
    	
    }

}
