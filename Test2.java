package com.oops.demo;

public class Test2 {

	public static void main(String[] args) {
		Test1  a1=new Test1 ("judith","jasmine");
		Test1  a2=new Test1 ("meera","jasmine");
		
		System.out.println(a1.getFirstName());
		System.out.println(a1.getLastName());
		
		System.out.println(a2);
		
		
		
		
		Test1  a3=new Test1 ();
		
		Test1  a4;
		//System.out.println(a4);
		
		a4=a2;
		System.out.println(a4);
		
		

	}

}