class NegativeAgeExp extends Exception{
	public String toString(){
		return "Age cannot be negative";
	}
}
public class CustomizeExp {
	static int age=-10;
	public static void main(String args[])
	{
		try{
			if(age<0){
				throw new NegativeAgeExp();
			}
		}
		catch(NegativeAgeExp e){
			System.out.println(e);
		}
	}

}
