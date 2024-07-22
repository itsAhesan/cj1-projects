package com.jony.accessModifiers;

public class AccessModifiers {
	
	public static void m1(){
		System.out.println("m1 method..");
	}
	protected static void m2(){
		System.out.println("M2 method of AccessModifiers class");
	}
	static void m3(){
		System.out.println("m3 method of AccessModifiers class");
	}
	private static void m4(){
		System.out.println("m4 method of AccessModifiers classs");
	}
	
	

	public static void main(String[] args) {
		AccessModifiers.m1();
		AccessModifiers.m2();
		AccessModifiers.m3();
		AccessModifiers.m4();
		

	}

}
