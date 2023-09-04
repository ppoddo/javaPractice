package com.kh.example.animal.model.vo;

public class Dog extends Animal{
	private double height;
	private String hair;
	
	public Dog() {}
	
	public Dog(String name, int age, double weight, double height, String hair) {
		super(name, age, weight);
		this.height = height;
		this.hair = hair;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getHair() {
		return hair;
	}
	
	public void setHair(String hair) {
		this.hair = hair;
	}
	
//	@Override
//	public String inform() {
//		return super.getName() + " " + super.getAge() + " " + super.getWeight() + " " + height + " " + hair;
//	}			// 부모클래스의 필드는 private로 되어있으므로 getter를 활용하여 해당 필드값 호출
	
	@Override
	public String toString() {	//Object 클래스에 있는 toString 메소드 불러와서 오버라이딩
		return super.getName() + " " + super.getAge() + " " + super.getWeight() + " " + height + " " + hair;
		//return super.toString() + height + hair; 도 가능
	}

}
