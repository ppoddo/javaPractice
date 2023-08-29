package com.kh.operater;

public class A_LogicalNegation {
	public void method() {
		System.out.println("true의 부정 : "  + !true);	//!(not) 논리부정연산자 반대값으로 바꿔준다.
		System.out.println("false의 부정 : "  + !false);	//반드시 피연산자의 앞에 위치한다.
				
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("bool1 : " + bool1);	//false;	//boolean변수를 선언하고 활용도 가능하다.
		System.out.println("!bool1 : " + !bool1); // true;	//boolean변수를 선언하고 활용도 가능하다.
		System.out.println("bool2 : " + bool2);  // true;
		System.out.println("!bool2 : " + !bool2); // false;
		
		System.out.println("!!bool1 : " + !!bool1); // false; 이렇게 장난도 칠 수 있다.
		System.out.println("!!bool2 : " + !!bool2); // true;
		
		
	}
}
