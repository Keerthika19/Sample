import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class GetNumbers {
	void getNum() throws IOException{
		FileWriter fr=new FileWriter("numbers.txt");
		BufferedWriter br= new BufferedWriter(fr);
		try{
		for(int i=1;i<=10;i++){
			String num=new String();
			num=Integer.toString(i);
			br.write(num);
			if(i!=10)
				br.write(",");
			else
				break;
		}
		}
		catch(IOException e){
			System.err.println(e);
			
		}
		finally{
			br.close();
			fr.close();
		}
	}
	
	void dispNUm() throws IOException{
		File file= new File("numbers.txt");
		//FileReader fr=new FileReader("numbers.txt");
		//BufferedReader br=new BufferedReader(fr);
		try{
			//String line=br.readLine();
			String line="";
			@SuppressWarnings("resource")
			Scanner in=new Scanner(file);
			while(in.hasNext()){
				line=in.nextLine();
			}
			String arr[]=line.split(",");
			int num[]=new int[10];
			for(int i=0;i<10;i++){
				num[i]=Integer.parseInt(arr[i]);
				if(num[i]%2==0){
					System.out.println(num[i]);
				}
			}
			
		}
		catch(IOException e){
			System.err.println(e);	
		}
		finally{
			//file.close();
			/*br.close();
			fr.close();*/
		}
	}

	public static void main(String[] args) throws IOException {
		GetNumbers g=new GetNumbers();
		g.getNum();
		g.dispNUm();

	}

}
