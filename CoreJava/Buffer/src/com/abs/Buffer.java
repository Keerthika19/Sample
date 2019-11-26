package com.abs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
	public static void main(String args[]){
		try{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter String");
		String s=br.readLine();
		
		System.out.println("Enter number:");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter number:");
		int n1=Integer.parseInt(br.readLine());
		System.out.println(s+" "+n+" "+n1);
	}
	catch(Exception e){
		System.out.println("Exception caught");
	}
	}

}
