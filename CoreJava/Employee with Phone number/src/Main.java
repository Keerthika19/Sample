import java.util.*;
public class Main {
	Employee acceptEmp(Employee e) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name:");
		e.setEmpName(in.next());
		System.out.println("Enter id:");
		e.setEmpId(in.nextInt());
		return e;
	}
	Phone acceptPhn(Phone p, int n) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter "+n+" phone number:");
		p.setPhoneNum(in.next());
		System.out.println("Enter "+n+" phone type :");
		p.setPhoneType(in.next());
		return p;
	}
	void display(Employee e, Phone p) {
		System.out.println("Employee name: "+e.getEmpName());
		System.out.println("Employee ID: "+e.getEmpId());
		System.out.println("Phone number: "+p.getPhoneType());
		System.out.println("Phone type: "+p.getPhoneNum());
		
	}
	public static void main(String args[]){
		Employee e1=new Employee();
		Main m=new Main();
		e1=m.acceptEmp(e1);
		Phone p1=new Phone();
		p1=m.acceptPhn(p1,1);
		Phone p2=new Phone();
		p2=m.acceptPhn(p2,2);
		System.out.println();
		m.display(e1,p1);
		System.out.println();
		m.display(e1,p2);
	}

}
