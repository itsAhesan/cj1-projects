package com.jony.collection;

import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		set.add(20);
		set.add(10);
		set.add(12);
		System.out.println(set);
		
		Set set2 = new TreeSet();
		set2.add("Neha");
		set2.add("Yana");
		set2.add("Jony");	
		System.out.println(set2);
		
		Student s1= new Student();
		s1.setId(200);
		s1.setName("Neha");
		s1.setAge(20);
		
		Student s2= new Student();
		s2.setId(150);
		s2.setName("Yana");
		s2.setAge(5);
		
		Student s3= new Student();
		s3.setId(300);
		s3.setName("Jony");
		s3.setAge(22);
		
		Set set3= new TreeSet();
		set3.add(s1);
		set3.add(s2);
		set3.add(s3);
		System.out.println(set3);
		
		
		
		

	}

}
