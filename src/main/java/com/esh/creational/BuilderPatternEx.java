package com.esh.creational;

import com.esh.creational.Student.StudentBuilder;

class Student{
	private int rollNum;
	private String name;
	private int age;
	private int height;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	static class StudentBuilder{
		private int rollNum;
		private String name;
		private int age;
		private int height;
		
		StudentBuilder rollNum(int rollNum){
			this.rollNum = rollNum;
			return this;
		}
		StudentBuilder name(String name){
			this.name = name;
			return this;
		}
		StudentBuilder age(int age){
			this.age = age;
			return this;
		}
		
		StudentBuilder height(int height){
			this.height = height;
			return this;
		}
		
		
		Student build(){
			Student student = new Student();
			student.setAge(age);
			student.setHeight(height);
			student.setName(name);
			student.setRollNum(rollNum);
			return student;
		}
	}
}
public class BuilderPatternEx {

	public static void main(String[] args) {
		StudentBuilder builder = new Student.StudentBuilder();
		Student student = builder.age(15).height(12).rollNum(12).name("eshia").build();
		System.out.println(student.getAge());
	}
}
