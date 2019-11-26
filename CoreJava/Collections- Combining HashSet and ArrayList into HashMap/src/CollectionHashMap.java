import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;


public class CollectionHashMap {
	public static void main(String args[]){
		ArrayList<Integer> al= new ArrayList<Integer>();
		HashSet<String> hs= new HashSet<String>();
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		hs.add("Sunday");
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thursday");
		hs.add("Friday");
		hs.add("Saturday");
		
		/*Iterator<String> itr=hs.iterator();
		for(int i=0;i<al.size();i++){
			hm.put(itr.next(),al.get(i));
		}*/
		
		Iterator<String> itr=hs.iterator();
		ListIterator<Integer> it=al.listIterator();
		while(it.hasNext() && itr.hasNext()){
			hm.put(itr.next(),it.next());
		}
	
		Iterator<Map.Entry<String,Integer>> itrr = hm.entrySet().iterator();
		while(itrr.hasNext()){
			System.out.println(itrr.next());
		}
		
		HashMap<HashSet<String>,ArrayList<Integer>> hash= new HashMap<HashSet<String>,ArrayList<Integer>>();
		hash.put(hs, al);
		System.out.println(hash);
			
	}

}
