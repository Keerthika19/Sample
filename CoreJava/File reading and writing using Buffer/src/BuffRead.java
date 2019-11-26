import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;


public class BuffRead {
	void read() throws IOException{
		FileReader fw =new FileReader("Text.txt");
		BufferedReader bwr =new BufferedReader(fw);
		try{
			int i ;
			boolean eof = false;
			/*while((i=bwr.read())!=-1)//Because the file is read char by char
			System.out.print((char) i);*/
			while(eof!=true){
				String line =bwr.readLine();
				if(line==null)
					eof=true;
				else
					System.out.println(line);
			}
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
		BuffRead bw =new BuffRead();
		bw.read();

	}

}
