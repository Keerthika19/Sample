//import java.util.*;
public class Wrapper {
	Integer meth1(double d){
		int in=(int)d;
		Integer i=Integer.valueOf(in);
		return i;
	}
	float meth2(Integer i){
		//int in=i.intValue();
		//float a=(float)in;
		float a=new Float(i);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=26.5;
		Wrapper w= new Wrapper();
		Integer i=w.meth1(d);
		float f=w.meth2(i);
		System.out.println(f);

	}

}
