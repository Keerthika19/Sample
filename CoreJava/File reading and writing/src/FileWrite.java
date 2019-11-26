import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileWrite {
	void write() throws IOException{
		//byte b[]=new byte[100];
		FileOutputStream f = null;
		try{
			//System.in.read(b); //This is to read the input as bytes
			Scanner in =new Scanner(System.in);
			String text=in.nextLine();
			//b=text.getBytes();
			f= new FileOutputStream("text.txt",true);//To append, give true
			f.write(text.getBytes());
			f.write("\n".getBytes());
		}
		catch(IOException e){
			System.out.println("Exception");
		}
		finally{
			f.close();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWrite w=new FileWrite();
		w.write();
		

	}

}
