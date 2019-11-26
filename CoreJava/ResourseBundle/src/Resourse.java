import java.util.Locale;
import java.util.ResourceBundle;


public class Resourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="Resourse_Bundle";
		ResourceBundle rb;
		
		rb=ResourceBundle.getBundle(res);
		System.out.println("Default : "+rb.getString("Hello.text"));
		
		rb=ResourceBundle.getBundle(res,Locale.GERMANY);
		System.out.println("German :"+rb.getString("Hello.text"));
		
		rb=ResourceBundle.getBundle(res,Locale.FRENCH);
		System.out.println("French :"+rb.getString("Hello.text"));


	}

}
