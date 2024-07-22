package com.jony.encaptulation;


public class EncaptulationDemo {
	public static void main(String[] args) {
		
		TestDemo td= new TestDemo();
		
		td.setId(101);
		td.setName("Neha");
		td.setAge(50);
		
		System.out.println(td.getId());	
		System.out.println(td.getName());
		System.out.println(td.getAge());
		
		

	}

}
