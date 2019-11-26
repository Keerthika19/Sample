
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class FileReverse {
	String st;

	void write(String s) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("out.txt");
			bw = new BufferedWriter(fw);
			bw.write(s);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			System.out.println(s);
			bw.close();
			fw.close();
		}

	}

	String read() throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		fr = new FileReader("out.txt");
		br = new BufferedReader(fr);
		String st = br.readLine();
		String rev = "";
		try {
			int n = st.length();
			for (int i = n - 1; i >= 0; i--) {
				rev = rev + st.charAt(i);
				// System.out.println(rev);

			}
		} catch (Exception e) {
			System.err.println(e);
		}

		finally {
			//System.out.println(rev);
			br.close();
			fr.close();
			return rev;
		}
	}

	public static void main(String[] args) throws IOException {
		FileReverse fd = new FileReverse();
		String s = "";
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		fd.write(s);
		s = fd.read();
		fd.write(s);
	}
}
