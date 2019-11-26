class MinBalException extends Exception{
		public String toString(){
			return "Your account balance  is too low, try later";
		}
	}
public class SavingAccount extends Account {
	final int minBal = 500;
	@Override
	public String toString() {
		return "Account number : "+ accNum+ "\nBalance : "+balance;
	}
	
	@Override
	void withdraw(double amt) {
		try{
		if (balance < minBal ) {
			throw new MinBalException();
		} 
		else{
			balance = balance - amt;
			System.out.println("The current balance is "+balance);
		}
		}
		catch(MinBalException e){
			System.out.println(e);
		}

	}
}
