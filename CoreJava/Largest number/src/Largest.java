import java.util.*;
public class Largest {
	int n;
	
	int largest(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		int l=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>l){
				l=arr[i];
			}
		}
		return l;
	}
		public static void main(String[] args) {
			Largest large=new Largest();
			int l=large.largest();
			System.out.println("The largest number is "+l);
	}

}

/*public class Largest{
	void Largest(){
		System.out.println("A");
	}
	public static void main(String args[]){
		new Largest();
		
	}
}*/