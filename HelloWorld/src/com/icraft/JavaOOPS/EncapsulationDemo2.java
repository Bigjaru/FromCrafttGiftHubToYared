package com.icraft.JavaOOPS;
class Account

{
	
	private String accountName;
    private int accountNumber;
    private int accountDeposit; 
    private int accountBalance;
    
    
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public int getAccountDeposit() {
		return accountDeposit;
	}
	public void setAccountDeposit(int accountDeposit) {
		if(accountDeposit <0 ) {
			System.err.println("error msg");
		}
		else {
		this.accountDeposit = accountDeposit;
		}
	}
	
	
	public int getAccountBalance() {
		return accountBalance + accountDeposit;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	} 

}

public class EncapsulationDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		
		acc.setAccountName("Soresa Hailu");
		acc.setAccountNumber(1234567890);
		acc.setAccountDeposit(10000000);
		acc.setAccountBalance(23455);
		
		System.out.println("Name : " + acc.getAccountName());
		System.out.println("Number : " + acc.getAccountNumber());
		System.out.println("Deposit : " + acc.getAccountDeposit());
		System.out.println("Balance : " + acc.getAccountBalance());
		
	}
}
