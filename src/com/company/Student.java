package com.company;

import java.lang.String;

public class Student extends Person{

	int course = 1;

	public Student(int age, int height, String name, int course){
		super(age,height,name);
		this.course = course;
		

	}

	

	void tell(){
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(super.height);
		System.out.println(course);
	}







}
