import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


public class CollectionsHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		HashMap<String,Integer> hm1= new HashMap<String,Integer>();
		hm.put("One", new Integer(1));
		hm.put("Two", new Integer(2));
		hm.put("Three", new Integer(3));
		hm.put(null, new Integer(0));
	
		hm1.putAll(hm);
		System.out.println(hm);
		
		System.out.println("HashMap contains " + hm.size() + " elements");
		if(hm.containsValue(new Integer(1))){
			System.out.println("HashMap contains 1 as value");
		}
		else{
			System.out.println("HashMap does not contain 1 as value");
		}
		
		if(hm.containsKey(null)){
			System.out.println("HashMap contains null");
		}
		else{
			System.out.println("HashMap doesnot contains null");
		}
		
		Integer o= (Integer) hm.get("One");
		System.out.println("Value mapped with key \"One\" is "+o);
		System.out.println("Retriving all the keys from the Hashmap");
		Iterator<String> itr=hm.keySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()); 
		}
			
		System.out.println("Retriving all the key-value pairs from the Hashmap");
		Iterator<Map.Entry<String, Integer>> itr1= hm.entrySet().iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		System.out.println("Hash Map's values");
		Iterator<Integer> i= hm.values().iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("Using Enhanced for loop");
		for(String key:hm.keySet()){
			Integer value=hm.get(key);
			System.out.println( key+ " : " + value);
		}

		for(Integer val:hm.values()){
			System.out.println(val);			
		}
		
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(hm.keySet());
		System.out.println("HashSet : "+hs);
		
	}

}
