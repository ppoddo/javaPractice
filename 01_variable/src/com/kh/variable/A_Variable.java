// com.kh.variable.A_Variable = 클래스의 풀네임(해당 경로(패키지)에 있는 클래스)
package com.kh.variable;

public class A_Variable {		//기능클래스
	public void declareVariable() {
		// 변수 선언 후 초기화
		// A. 변수 선언 : Stack메모리 영역에 공간 생성 -> 자료형 변수명 ;
		// 1. 논리형
		boolean isTrue;
		// 2. 문자형
		// 2-1. 문자
		char ch;
		// 2-2. 문자열
		String str;
		// 3. 숫자형
		// 3-1 정수
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 3-2 실수
		float fNum;
		double dNum;
		
		// B. 초기화(대입) - 위에서 선언을 하였다면 초기화를 할 때는 중복선언을 하면 안됨;
		isTrue = true;
		ch = 'a';//한글자를 감쌀때는 ''를 사용 -> 문자(ch)는 무조건 1글자(비우면 안됨)
		str = "abc"; //여러글자를 감쌀때는 ""를 사용 ->문자열(String)은0글자 이상(비워놔도됨)
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // L을 생략해도 된다 정수는 기본형인 int로 먼저 읽히는데 8은 int안에 들어갈 수 있기때문;
		fNum = 4.0f;
		dNum = 8.0;
		
			System.out.println(isTrue);
			System.out.println(ch);
			System.out.println(str);
			System.out.println(bNum);
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(lNum);
			System.out.println(fNum);
			System.out.println(dNum);
	
	}
	
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 1. 논리형
		boolean isTrue = false;
		// 2. 숫자형
		// 2-1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8;
		
		// 2-2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. 문자형
		// 3.1 문자
		char ch = 'b';
		// 3.2 문자열
		String str = "한";
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		
	}
	
	
}
