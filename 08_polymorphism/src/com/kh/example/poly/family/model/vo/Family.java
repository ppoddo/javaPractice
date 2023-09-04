package com.kh.example.poly.family.model.vo;

	//추상클래스로 만드는 예약어 abstract 사용
public abstract class Family {
	private String name;
	private double weight;
	private int health;
	
	public Family() {}
	public Family(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return name + " " + weight + " " + health;
	}
	
	//abstract 메소드는 abstract 클래스 안에서만 존재 가능하므로 사용하려면 클래스를 변경
	public abstract void eat();
	public abstract void sleep();
}
