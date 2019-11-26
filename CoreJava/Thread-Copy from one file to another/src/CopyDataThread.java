import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable{

	BufferedReader br=null;
	BufferedWriter bw=null;

	public CopyDataThread(FileReader fr, FileWriter fw) {
		// TODO Auto-generated constructor stub
		this.br = new BufferedReader(fr);
		this.bw = new BufferedWriter(fw);

	}

	public void run(){
		/*FileReader fr=null; FileWriter fw=null; BufferedReader br=null; BufferedWriter bw=null;*/
		try {
			/*fr = new FileReader("Source.txt"); fw = new FileWriter("Target.txt");
			br= new BufferedReader(fr);	bw=new BufferedWriter(fw);*/
			int k=0,i;
			while(k!=-1){
				for (i = 0; i < 10; i++) {
					k = br.read();
					if(k==-1){
						break;
					}
					else {
						//System.out.print((char) k);
						bw.write((char) k);
						//bw.write("Hi");
					}
				}
				Thread.sleep(1000);
				System.out.println(i+" Characters copied");
			}
			
		
		} catch (IOException e) {
			System.err.println(e);
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	/*public class CopyDataThread {

		public static void main(String[] args) throws IOException {
			
			CopyDataThread c = new CopyDataThread(fr,fw);
			Thread t = new Thread(c);
			t.start();

		}
	}*/
}