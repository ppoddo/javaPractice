package com.kh.example.poly.family.model.vo;
									//인터페이스에서 구현할 때 사용, 여러개 사용 가능
public class Mother extends Family implements Basic, Cloneable{
	
	@Override
	public void eat() {
		System.out.println("Mother eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Mather sleep");
	}

	@Override
	public void breathe() {
		
	}

	@Override
	public void die() {
		
	}

}
