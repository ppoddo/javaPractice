package com.kh.operater;

public class C_Arithmetic {
	public void method() {
		int iNum1 = 35;
		int iNum2 = 10;
		
		System.out.println(iNum1/iNum2);  	//몫 3
		System.out.println(iNum1%iNum2);	//나머지 5
		
		double dNum1 = 35;
		double dNum2 = 10;
		
		System.out.println(dNum1/dNum2);	//실수에서의 나누기는 소수점까지 나올 수 있는곳까지 계산되기 때문에 3.5
		System.out.println(dNum1%dNum2);	//나머지란 처음나눴을때의 나머지 값을 가져오는 것. 5.0
		
		
	}
	
}
