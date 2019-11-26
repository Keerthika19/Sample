	import java.util.*;
	public class EmployeeObject
	{
		int id;
		String name;
		long mob;
		static int size;
		void accept()
		{
			//for(int i=0;i<size;i++){
			Scanner in =new Scanner(System.in);
			System.out.println("-----Employee Details------");
			System.out.println("Enter id:");
			id=in.nextInt();
			System.out.println("Enter name:");
			name=in.next();
			System.out.println("Enter mobile number:");
			mob=in.nextLong();
			//}
	
		}

		void display()
		{
			//System.out.println();
			System.out.println(id);
			System.out.println(name);
			System.out.println(mob);
		}

		public static void main(String args[])
		{
			
			Scanner in =new Scanner(System.in);
			System.out.println("Enter the number of details:");
			size=in.nextInt();
			EmployeeObject emps[]= new EmployeeObject[size];
			for(int i=0;i<size;i++){
				
				emps[i]=new EmployeeObject();
				emps[i].accept();
				
			}
			for(int i=0, j=1;i<size;i++,j++){
				System.out.println();
				System.out.println("Employee " +j+ " Details");
				emps[i].display();
			}
		}
	}
