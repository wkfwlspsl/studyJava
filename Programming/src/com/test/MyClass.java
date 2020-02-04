package com.test;

public class MyClass {
	private String name;
	private int age;
	private String job;
	
	public MyClass(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public String getName(String collection) {
		return  collection + "." + this.name + this.age + this.job;
	}
}
