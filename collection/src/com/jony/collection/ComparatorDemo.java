package com.jony.collection;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		Set set = new TreeSet(new CustomSort());
		set.add(20);
		set.add(10);
		set.add(12);
		System.out.println(set);
		
		
		
		

	}

}
