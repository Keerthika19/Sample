import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith=new Person();
		Person kathy=new Person();
		
		Account acc1=new SavingAccount();
		Account acc2=new SavingAccount();
		
		smith.setName("Smith");
		smith.setAge(20.0f);
		acc1.setAccNum((int)(Math.random()*1000000000));
		acc1.setBalance(2000);
		smith.setAccHolder(acc1);
		
		kathy.setName("Kathy");
		kathy.setAge(21);
		acc2.setAccNum((int)(Math.random()*1000000000));
		acc2.setBalance(3000);
		kathy.setAccHolder(acc2);
		
		System.out.println(acc1.getAccNum());
		System.out.println(acc2.getAccNum());
		
		acc1.deposit(2000);
		
		System.out.println("The current balance is "+acc1.getBalance());
		System.out.println("The current balance is "+acc2.getBalance());
		
		acc2.withdraw(2000);
		acc2.withdraw(800);
		acc2.withdraw(2000);
		
		System.out.println();
		System.out.println(kathy);
		System.out.println(acc2);
		System.out.println();
		System.out.println(smith);
		System.out.println(acc1);
		
		System.out.println();
		System.out.println(acc1 instanceof Account);
		System.out.println(acc1 instanceof SavingAccount);
		//System.out.println(acc1 instanceof Person);

	}

}
