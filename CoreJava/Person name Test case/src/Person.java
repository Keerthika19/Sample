
public class Person {
	
	private String first;
	private String last;
	
	Person(){
		
	}
	
	public Person(String fn, String ln){
		if((fn==null)&&(ln==null)){
			throw new IllegalArgumentException("Both names cannot be null");
		}
		first=fn;
		last=ln;
	}
	
	public String getFullName(){
		return first+" "+last;
	}
	
	public String getFirstName(){
		return this.first;
	}
	public String getLastName(){
		return this.last;
	}

}
