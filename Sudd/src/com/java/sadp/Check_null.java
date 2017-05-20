package com.java.sadp;

public class Check_null {
	public static void method(String s){
		System.out.println("in method");
	}

	public static void main(String [] args)
	{
		Check_null a = null;
		a.method("ABC");
	}
}
