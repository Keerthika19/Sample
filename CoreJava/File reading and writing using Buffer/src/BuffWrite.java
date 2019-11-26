import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BuffWrite {
	void write() throws IOException{
		FileWriter fw =new FileWriter("Text.txt");
		BufferedWriter bwr =new BufferedWriter(fw);
		/*FileReader f =new FileReader("Text.txt");
		BufferedReader b =new BufferedReader(f);*/
		try{
			int i;
			String text="";
			char c;
			//do{
			while(true){
				
				Scanner in=new Scanner(System.in);
				text=in.nextLine();
				if(text.equals("q"))
				{
					break;
				}
				bwr.write(text);
				bwr.write("\n");
			}
				/*while((i= b.read())!=-1)//Because the file is read char by char
				System.out.print((char)i);*/
			
			/*bwr.write("JAVA was developed by Sun Microsystems Inc in 1991, "
					+ "\nlater acquired by Oracle Corporation. It was developed"
					+ "\nby James Gosling and Patrick Naughton. It is a simple"
					+ "\nprogramming language. Writing, compiling and debugging a"
					+ "\nprogram is easy in java. It helps to create modular programs"
					+ "\nand reusable code.");*/
			//}while((i=c)!=46);
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
		BuffWrite bw =new BuffWrite();
		bw.write();

	}

}
