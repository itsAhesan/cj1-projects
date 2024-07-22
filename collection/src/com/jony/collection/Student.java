package com.jony.collection;

public class Student implements Comparable{
	
	private int id;
	private String name;
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Student st3 =(Student) obj;
		
		return this.id==st3.id;
	}
	@Override
	public int compareTo(Object o) {
		Student s1=(Student) o;
		
		return -(this.id-s1.id);
	}
	
	
	
	
	
	
	

}
