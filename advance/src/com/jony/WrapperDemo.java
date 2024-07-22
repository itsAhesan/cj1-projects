package com.jony;

public class WrapperDemo {

	public static void main(String[] args) {
		int i=10;
		
		Integer integer = new Integer(i);		// Primitive to Object ---->BOXING
		
		System.out.println(integer);
		
		int intValue = integer.intValue();		// Object to primitive----> UNBOXING
		
		System.out.println(intValue);
		
		// after JDK 1.5 
		
		int j=20;
		
		Integer obj=j;				//AUTO BOXING	
		System.out.println(obj);
		
		int obj2 = obj;				//AUTO UNBOXING	
		System.out.println(obj2);

	}

}
