package com.demo.pack;

import com.pack.First;

public class Second {
	void meth2()
	{
		System.out.println("Method2");
	}
	public static void main(String args[]){
		First first=new First();
		first.meth1();
		Second second= new Second();
		second.meth2();
	}

}