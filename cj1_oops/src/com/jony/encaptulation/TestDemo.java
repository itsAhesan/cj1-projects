package com.jony.encaptulation;

public class TestDemo {
	private int id;			//101
	private String name;	//Neha
	private int age;		//21
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
		
	}
	public void setAge(int age){
		if(age<=50){
			this.age=age;
		}
		
		
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	

}
