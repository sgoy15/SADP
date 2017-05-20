package com.java.sadp;

public class Reversal {
	
	public static void main(String[] args)
	{
		String name="Sudhanshu";
		StringBuilder obj= new StringBuilder(name);
		
		reverse (obj,0,name.length()-1);
		System.out.println(name);
	}

public static void reverse(StringBuilder obj, int i, int j) {
		// TODO Auto-generated method stub
	if(i>j)
		return;
	swap(obj,i,j);
	reverse(obj,i+1,j-1);
		
	}

public static void swap(StringBuilder obj,int i, int j) {
	// TODO Auto-generated method stub
	char temp;
	temp=obj.charAt(i);
	obj.setCharAt(i, obj.charAt(j)); 
	obj.setCharAt(j, temp);

}

}
