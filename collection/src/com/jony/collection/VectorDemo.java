package com.jony.collection;

import java.awt.List;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		Iterator<Integer> iterator = v.iterator();		//10 20 30 40  
		
		while(iterator.hasNext()){ 
			Object next = iterator.next();	
			
			Integer i=(Integer) next;
			int intValue = i.intValue();
		
			System.out.println(intValue); 		//10 20 30 40 
		}
		
		
		
		
	}

}
