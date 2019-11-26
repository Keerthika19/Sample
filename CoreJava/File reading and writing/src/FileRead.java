import java.io.FileInputStream;
import java.io.IOException;


public class FileRead {
	void read() throws IOException{
		byte b[]=new byte[100];
		FileInputStream f = null;
		try{
			f= new FileInputStream("text.txt");
			f.read(b);
			String test=new String(b);//Byte cannot be printed as such so convert it into string to print
			System.out.println(test.trim());
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
		FileRead r=new FileRead();
		r.read();
		

	}

}
