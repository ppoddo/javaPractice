package com.kh.example.animal.model.vo;

public class Snake extends Animal {
	private String pattern;
	
	public Snake() {}
	
	public Snake(String name, int age, double weight, String pattren) {
		super(name, age, weight);		//super()생성자를 통해서 부모클래스의 생성자를 호출
		this.pattern = pattren;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public void setPattren(String pattren) {
		this.pattern = pattren;
	}
	
//	@Override
//	public String inform() {
//		return super.inform() + " " + pattern;
//	}			// super.inform() 메소드를 활용하여 필드값 호출 가능.
	
	@Override
	public String toString() {
		return super.toString() + " " + pattern;
		//Animal의 toString을 호출
	}
}
