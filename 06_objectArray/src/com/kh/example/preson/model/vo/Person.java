package com.kh.example.preson.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Person(String name, int age, char gender, double height, double weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	//게터 세터
	
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
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String personInfo() {	//사람 정보 불러오는 메소드
		return name + ", " +  age + ", " +  gender + ", " +  height + ", " + weight;
	}
}
