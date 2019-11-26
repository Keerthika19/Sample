import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		long mobile;
		HashSet<Student> s1= new HashSet<Student>();
		char choice;
		do{
			Student stud =new Student();
			Scanner in=new Scanner(System.in);
			System.out.println("Enter id:");
			id=in.nextInt();
			System.out.println("Enter name:");
			name=in.next();
			System.out.println("Enter mobile:");
			mobile=in.nextLong();
			stud.set(id,name,mobile);
			s1.add(stud);
			System.out.println("Do you want to enter more? \nPress y-yes\n      n-No");
			choice = in.next().charAt(0);
		}while(choice=='y');
		
		/*stud[0].set(1,"Keerthi",923892628);
		s1.add(stud[0]);
		stud[1].set(2,"Mahi",345769700);
		s1.add(stud[1]);*/
		
		//Using iterator
		Student b;
		Iterator<Student> itr=s1.iterator();
		
		while(itr.hasNext()){
			b=itr.next();
			System.out.println("Name :"+ b.getName()+ " Id :"+b.getId() + " Mobile id:"+b.getMobile());
		}
		
		//Using toString
		/*for(Student s:s1){
			System.out.println(s);
		}*/
	}

}
