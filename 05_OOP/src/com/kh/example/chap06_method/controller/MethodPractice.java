package com.kh.example.chap06_method.controller;

public class MethodPractice {
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		//반환값X    	매개변수X
		System.out.println("매개변수와 반환 값 둘 다 없는 메소드입니다.");
	//	return; == 반환할게 없기 때문에 리턴을 안써도 되지만 써도 가능
		// 단, void 메소드에 return 뒤에 값을 넣으면 안된다.
	}
	
	//	2. 매개변수 없고 반환 값 있는 메소드
	public double method2() {
		//반환값O		매개변수X
		return Math.random();
	}
	
	// 3. 매개변수 있고 반환 값 없는 메소드
	public void method3(int score, String name) {
		//반환값X				매개변수O
		System.out.println(score + "점을 받은  " + name + "학생은 오늘 남으세요");
	}
	
	//	4. 매개변수 있고 반환 값 있는 메소드
	public int method4(int num1, int num2) {
		//반환값O				매개변수O
		return num1 + num2;
	}
	
	public String[] method5() {
		String[] strArr = {"빨강", "주황", "파랑"};
		System.out.println("MethodPractice strArr : " + strArr);
		return strArr;
	}
}
