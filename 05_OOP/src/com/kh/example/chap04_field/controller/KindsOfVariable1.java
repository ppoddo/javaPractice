package com.kh.example.chap04_field.controller;

//	변수 선언 위치에 따른 구분
public class KindsOfVariable1 {	//클래스 영역
	// 전연변수 = 멤버변수 = 멤버필드 = 필드 : 클래스 영역에 작성하는 변수
	
	private int globalNum; // 필드
	
	public void method1() { // 메소드 영역
		//	지역변수 : 메소드 영역에서 작성하는 변수
		int localNum = 0; //지역 변수		//지역변수는 반드시 초기화를 해줘야 함.
		System.out.println(globalNum);
		System.out.println(localNum);
	}

	public void method2(int num1) {	//	정의해준 자료형으로 값을 받아야하므로
									// 사용자는 반드시 정의된 자료형을 따라야 한다.
		//System.out.println(localNum);
		System.out.println(num1); // 매개변수도 지역변수로 분류
								//but, 매개변수는 값을 받는 역할이기때문에 오류가 안뜸
							//즉, 값이 무조건 들어오게 될 변수이기 때문에 초기화가 될 수 밖에 없다.
	}
}
