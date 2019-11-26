import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;


public class CollectionArray {
	public static void main(String args[]){ 
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(20);
		al.add(15);
		
		System.out.println("ArrayList : "+al);
		
		ListIterator<Integer> itr= al.listIterator();
		System.out.println("Using Iterator : ");
		while(itr.hasNext()){			
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		System.out.println("Using For each loop : ");
		for (Object o:al){			
			System.out.print(o+" ");
		}
		System.out.println();
		
		System.out.println("Using For loop : ");
		for (int i=0; i<al.size();i++){			
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Sorted elements");
		Collections.sort(al);
		for (Object o:al){
			System.out.print(o+" ");
		}
		System.out.println();
		
		Integer arr[]= al.toArray(new Integer[al.size()]);
		System.out.println("Array : ");
		for (Integer o:al){
			System.out.print(o+" ");
		}
		System.out.println();
		
		ArrayList<Integer> al1=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("ArrayList : ");
		for (Object o:al){
			System.out.print(o+" ");
		}
		System.out.println();
		
	}

}
