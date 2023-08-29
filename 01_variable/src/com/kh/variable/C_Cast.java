package com.kh.variable;

public class C_Cast {
	 // 자동형변환구문
	public void cast1() {
		byte bNum = 3;
		int iNum = bNum;
		 // 4byte <- 1byte :자동형변환
		
		long lNum = 100;
		float fNum = lNum;
		//  4byte(실수)  8byte(정수) : 실수 > 정수 이므로 자동형변환이 이루어진다.
		
		int num = 'A'; // 문자는 아스키코드와 유니코드로써 저장되어 있긴 때문에 자동으로 형변환이 이루어진다.	num = 65
		char ch1 = 97; // 위와 반대로 숫자가 문자로 변환 가능하다 ch1 = 'a';
						// 참고로 변환되는 자료형은(형태는) 선언하는 자료형을 따른다!!
						// 또한 97은 기본형인 int를 따라서 아래예시와 같은 이유로 안되는게 맞지만
						// 공간을 가진(자료형을 선언한)것이 아닌 리터널(값 그 자체)이기 때문에 가능하다.
						// 큰 집을 작은 집에 우겨넣는건 힘들지만 집이란 공간이 없는 값 자체는 들어갈 수 있음.
						// 정리하자면 형변환은 리터널이 자료형으로써 가진 byte수 = stack메모리의 크기로 결정된다.
		
		
//		char ch2 = num; // num(int) 는 4byte고 ch2(char)는 2byte이므로 자동으로 형변환되지 않는다.
		char ch2 = (char)num; //강제로 형변환을 하려면 같은 자료형을 강제로 입력해야가능하다.
		
		
		double dNum = 10.00000001;
		short sNum = (short)dNum;

	}	
	
	public void cast2() {
		int iNum = 10;
		long lNum = 100L;
		
//		int result = iNum + lNum; //큰 자료형으로 변환시켜서 계산하는데 계산값을 그보다 작은 자료형에 담으려고해서 오류
		
		long result1 = iNum + lNum;	// 방법 1.결과를 long형으로 받기(자료형을 long)
		
		int result2 = (int)(iNum + lNum); // 방법 2. 수행결과를 int로 강제 형변환하기 
										  // 괄호를 사용해서 전체결과를 변환가능(long타입만 바꿔줘도 가능은 함 아래참조)
	
		int result3 = iNum + (int)lNum;   //방법 3. long형 값을 int로 강제 형변환
		
		
	}
	
	
	

}
