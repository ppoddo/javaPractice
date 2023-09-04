package com.kh.example.poly.family.model.vo;

import java.io.Serializable;

//인터페이스		//인터페이스를 상속하는	//다중 상속 가능
public interface Basic extends Cloneable, Serializable{
						//마커 인터페이스(marker interface)
	public abstract void breathe();	// 추상메소드를 이렇게 만들어도 되지만
	void die(); 	//이렇게 생략해도 가능하다 어차피 인터페이스안에는 모두 추상메소드기때문
	
	public static final double PI = 3.14;	//변수도 이렇게 만들어도 되지만
	int MAX = 100;		//이렇게 생략해도 가능하다 어차피 인터페이스 안에는 모두 static final이기 때문
	
	
	//클래스 상속, 구현 == extends,    인터페이스 상속 == extends;
								//인터페이스 구현 == implements;
}
