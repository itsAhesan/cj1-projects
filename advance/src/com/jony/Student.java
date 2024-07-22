package com.jony;

public class Student extends Object{
	
	private int id;
	private String name;
	
	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public String toString() {
		
		return id+" "+name;
	}
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode()==obj.hashCode();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized Method executes..");
	}
	
	
	
	
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	

}
