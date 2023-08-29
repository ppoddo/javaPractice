package com.kh.variable;

public class B_Constant {

	public void finalConstant() {
		int age;		//(일반)변수
		final int AGE; //final(종단)은 자료형 앞에 위치해야함.
		
		age = 10;
		AGE = 20;
		
		age = 11; // 일반 변수는 마지막으로 입력된 값을 지닌다 -> 런하면 11로 나옴.
//		AGE = 21; final은 예약어다.
		
		System.out.println(age);
		System.out.println(AGE);
	
		String str = 123 + 45 + "기차" + "출발";	//168기차출발//String 문자열의 활용과 특성
		String str1 = "기차" + 123 + 45 + "출발"; //기차12345출발
		
		
		System.out.println(str);
		System.out.println(str1);
		
		
		
	}
				
}
