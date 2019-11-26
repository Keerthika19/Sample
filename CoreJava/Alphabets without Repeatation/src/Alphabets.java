public class Alphabets {
	int n = 5,k;
	int a[] = new int[n];
	int b[] = new int[n];
	char c[] = new char[26];

	void generate() {
		int i;
		for (i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 26) + 65;
			// System.out.println(a[i]);
		}
	}

	void sort() {
		 //Arrays.sort(a);
		int i, j, t;
		for (i = 0; i < n; i++) {
			// System.out.println("I loop");
			for (j = i+1; j < n; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		//System.out.println("Sorted"+a.length);
		/*int i;
		for (i = 0; i < n; i++) {
			 System.out.println(a[i]);
		}*/
	}

	void duplicate() {
		int  f = 0, i, j;
		for (i = 0; i < n; i++) {
			// System.out.println("I loop");
			for (j = i + 1; j < n; j++) {
				// System.out.println("J loop");
				// System.out.println(a[i]+ " "+ a[j]);
				if (a[i] == a[j]) {
					f = 1;
					b[k]=a[i];
					k++;
					break;
				}
			}
			if (f == 0) {
				b[k]=a[i];
				c[k]=(char)b[k];
				// System.out.print(" "+b[k]);
				 //System.out.print(" "+c[k]);
				k++;
				f = 0;
			}
		}
	}
	
	void display(){
		int i;
		for (i = 0; i < k; i++) {
			//c[i]=(char)b[i];
			System.out.println(c[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets al = new Alphabets();
		al.generate();
		al.sort();
		al.duplicate();
		al.display();

	}

}
/*void generate(){
int i;
int j;
int a;
int b[]=new int[100];
char c[]=new char[26];
//Random rn = new Random();
for(i=0;i<100;i++){
	a=(int)(Math.random()*26)+65;
	System.out.println(a);
	if(a>=61 && a<=91){
			System.out.println(a);
			b[i]=a;
			
	}
	Arrays.sort(b);
	for(i=0;i<100;i++){
		for(j=0;j<=i;j++){
			if(i==0)
			{
				b[i]=a;
			}
			else {
				if (b[i] != b[j]) {
					System.out.print(" " + b[n]);
					b[n] = b[i];
					n++;
					c[i] = (char) b[i];
					System.out.println(c[i]);
				}
			}
		}
	}
}
	
for(i=0;i<n;i++){
	c[i]=(char)b[i];
	System.out.println(c[i]);
}

*/