import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadInt {
	/*void write() throws IOException {
		FileWriter f=null;
		BufferedWriter b=null;
		try{
			f=new FileWriter("Text.txt");
			b=new BufferedWriter(f);
			String s="Hello";
			f.write(s);
		}
		catch(IOException e){
			System.out.println("Exception");
		}
		finally{
			f.close();
			b.close();
		}
		
	}*/
	void read() throws IOException{
		FileReader fw =new FileReader("Text.txt");
		BufferedReader bwr =new BufferedReader(fw);
		try{
			int i;
			//boolean eof = false;
			/*while((i=bwr.read())!=-1)//Because the file is read char by char
			System.out.print((char) i);*/
			//while(eof!=true){
			do{
				i =bwr.read();
				if(i==-1)
					break;
				else
					System.out.print((char)i);
			}while(i!=-1);
		}
		catch(EOFException e){
			System.out.println("Exception");
		}
		finally{
			bwr.close();
			fw.close();
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadInt bw =new ReadInt();
		//bw.write();
		bw.read();

	}

}
