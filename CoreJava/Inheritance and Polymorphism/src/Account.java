abstract class Account {
	protected long accNum;
	protected double balance;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit (double amt){
		balance=balance+amt;
	}
	
	abstract void withdraw(double amt);
	
}