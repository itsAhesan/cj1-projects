package com.jony.collection;

import java.util.Stack;

public class StackDemoo {
	public static void main(String[] args) {
		
		
		Stack<Integer> s= new Stack<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.push(40);
		System.out.println(s.peek());	//30
		System.out.println(s);
		
		
		
		/*while(s.size()!=0){
			System.out.println(s.pop());
		}*/
		
		
	
		
	}

}
