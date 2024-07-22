package com.jony.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> arrList=new ArrayList<Integer>();
		arrList.add(100);
		arrList.add(200);
		arrList.add(300);
		arrList.add(400);
		arrList.add(1,150);
		System.out.println(arrList);
		
		List<Integer> linkList= new LinkedList<Integer>();
		linkList.add(100);
		linkList.add(200);
		linkList.add(300);
		linkList.add(400);
		linkList.add(1,150);
		System.out.println(linkList);
		
		

	}

}
