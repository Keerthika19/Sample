

public class Student {
	private int id;
	private String name;
	private long mobile;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public long getMobile() {
		return mobile;
	}
	
	public void set(int id, String name, long mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	public String toString(){
		return "Name :"+ name + " Id :"+id + " Mobile id:"+mobile;
	}
	
	public int hashCode(){
		return 12;
	}
	
	public boolean equals(Object ob){
		boolean flag=false;
		Student s= (Student)ob;
		if((this.id==s.id)&&(this.name).equals(s.name))
			flag =true;
		
		return flag;
		
		
	}
}
