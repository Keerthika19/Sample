import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Source.txt");
		FileWriter fw = new FileWriter("Target.txt");
		
		CopyDataThread c = new CopyDataThread(fr,fw);
		Thread t = new Thread(c);
		t.start();

	}
}
