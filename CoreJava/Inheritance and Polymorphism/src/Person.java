class Person {
	private String name;
	private float age;
	private Account accHolder;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public Account getAccHolder(){
		return accHolder;
	}
	public void setAccHolder(Account accHolder){
		
		this.accHolder= accHolder;
	}
	public String toString(){
		return "Name :"+name+"\nAge :"+age;
	}
}