import java.util.*;

public class CollectionsHash {
	
	public static void main(String args[]){
		HashSet<String> s1= new HashSet<String>();
		s1.add("Hi");
		s1.add("");
		s1.add("Everyone");
		s1.add("Welcome");
		
		System.out.println("Elements as a set "+s1);
		System.out.println("\n s1.contains Java :" +s1.contains("Everyone"));
		
		TreeSet<String> t1= new TreeSet<String>(s1);
		System.out.println("t1.equals s1 : "+ t1.equals(s1));
		
		Iterator<String> itr=t1.iterator();
		System.out.println("Iteration type 1 : ");
		while(itr.hasNext())
		{
			String e=(String)itr.next();
			System.out.println(e);
		}
		System.out.println("Iteration type 2: ");
		for(Object o:t1)
			System.out.println(o);
		
	}

}
