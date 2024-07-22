package com.jony;

public class StringObj {

	public static void main(String[] args) {
		
		String name1="Neha";
		String name2="Neha";
		
		System.out.println(name1==name2); 	// 1001==1001
		System.out.println(name1.equals(name2));	//true	
		
		
		String name3= new String("Rokeya");
		String name4= new String("Rokeya");
		
		System.out.println(name3==name4);	//1002==1003
		System.out.println(name3.equals(name4));	//true	
		
		
	}

}
