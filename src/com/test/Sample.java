package com.test;

public class Sample {
	
public static void main(String[] args) {
		
		int[] a=new int[5];
		
		try
		{
			System.out.println(a[7]);
		}
		
		catch(ArithmeticException ar)
		{
			System.out.println(ar.getMessage());
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("Array Index out of bounds occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent of Exception occurs" );
		}
		
		System.out.println("Rest of code");

	}


}
