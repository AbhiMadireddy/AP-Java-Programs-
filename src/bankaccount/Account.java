package bankaccount;

public class Account {
	
	private String name;
	private int accountNumber;
	private double balance; 
	private static int accountNumbers = 1000;
	
	public Account(String n, double b) {
		this.name = n; 
		this.accountNumber = accountNumbers; 
		accountNumber++; 
		this.balance = b; 
	}
	
	
	public void interest() {
		this.balance *= 1.01; 
	}
	
	
	public String toString() {
		return this.name+" : " + this.balance; 
	}
	
	
	public void deposit(int a) {
		this.balance = this.balance+a; 
	}
	
	public boolean withdrawal(double a) {
		if(this.balance >= a) {
			this.balance -= a; 
			return true; 
		}else {
			System.out.println("not enough money broke-ass");
			return false; 
		}
	}
	
	public double getBalance() {
		return this.balance; 
	}
	
	


}
