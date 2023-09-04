package com.kh.example.animal.model.vo;

public class Animal {
	private String name;
	private int age;
	private double weight;
	
	public Animal() {}
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		
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
	
	public double getWeight() {
		return weight; 
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
//	public String inform() {	//확인하기
//		return name + " " + age + " " + weight;		//인폼이라는 메서드를 작성해도됨.
//	}

//	@Override
//	public String toString() {		// toString을 직접 써서 사용해도 됨.
//		return " ";
//	}
	
	@Override				//컨+스 에서 toString을 불러오면 자동으로 작성해주고
	public String toString() { 			//그 이후에 내가 원하는 내용으로 바꿔서==오버라이딩해서 사용 가능
		return name + " " + age + " " + weight;
	}
}
