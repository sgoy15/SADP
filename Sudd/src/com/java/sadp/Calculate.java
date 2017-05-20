package com.java.sadp;

import java.util.Scanner;

public class Calculate {


	public enum operation{
		Add,Subtract,Multiply,Divide
	};

	public int calculate(int a,int b, operation c)
	{
		int result=0;
		switch(c)
		{

		case Add:
			result= a+b;
			break;
		case Subtract:
			result =a-b;
			break;
		case Divide:
			result= a/b;
			break;
		case Multiply:
			result= a*b;
			break;
	
		}
		return result;


		//		if(c.equals(operation.Add))
		//		{
		//			return a+b;
		//		}
		//		else if(c.equals(operation.Subtract))
		//		{
		//			return a-b;
		//
		//		}
		//		else if(c.equals(operation.Multiply))`
		//			return a*b;
		//		else if(c.equals(operation.Divide))
		//		{
		//			if (b==0)
		//				return 0;
		//			return a/b;
		//		}
		//
		//		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c= sc.next();

		Calculate C= new Calculate();
		C.calculate(a,b,operation.Add);
		C.calculate(a,b,operation.Subtract);
		C.calculate(a,b,operation.Multiply);
		C.calculate(a,b,operation.Divide);

	}

}
