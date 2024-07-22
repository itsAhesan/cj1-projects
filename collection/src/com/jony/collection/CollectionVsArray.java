package com.jony.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionVsArray {

	public static void main(String[] args) {
		
		int[] numbers=new int[5];
		numbers[0]=50;
		numbers[1]=51;
		numbers[2]=52;
		numbers[3]=53;
		numbers[4]=54;
	//	numbers[5]="Neha";
		
		
		System.out.println("In array");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);	
		}
		
		System.out.println("In Collection");			// 50 100 20 30 10---> 10 20 30 50 100
		Collection col=new ArrayList();
		col.add(101);
		col.add(102);
		col.add(103);
		col.add(104);
		col.add("neha");
		System.out.println(col);
		
		

	}

}
