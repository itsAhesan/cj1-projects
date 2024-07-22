package com.jony.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set hashSet =new HashSet();		//No order
		hashSet.add(101);
		hashSet.add(108);
		hashSet.add(106);
		hashSet.add(108);
		hashSet.add("A");
		
		System.out.println(hashSet);		
		
		Set ls= new LinkedHashSet();		//Preserve insertion order
		ls.add(10);
		ls.add(20);
		ls.add(8);
		
		System.out.println(ls);
		
		Set ts=new TreeSet();			//ASC or DSC order			// 50 10 30 5 20
		
		ts.add(50);
		ts.add(10);
		ts.add(30);
		ts.add(5);
		ts.add(20);
		
		System.out.println(ts);
		
		

	}

}
