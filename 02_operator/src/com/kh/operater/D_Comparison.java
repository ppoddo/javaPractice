package com.kh.operater;

public class D_Comparison {
	public void method() {
		int a = 10;
		int b = 25;
		
		boolean result1 = a == b;	//false
		boolean result2 = a <= b;	// true
		boolean result3 = a > b;	// false		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		// b가 짝수/홀수 판단

		System.out.println("b가 짝수인가?" + (b%2 == 0)); //짝수인지 물어보기//false
		System.out.println("b가 짝수인가?" + (b%2 == 1)); //짝수인지 물어보기//true
		
		System.out.println("b가 짝수가 아닌가?" + (b%2 != 0)); //짝수가 아닌지 물어보기//true
		System.out.println("b가 짝수가 아닌가?" + (b%2 != 1)); //짝수가 아닌지 물어보기//false
		
		System.out.println("b가 홀수인가?" + (b%2 == 1)); //홀수인지 물어보기//true
		System.out.println("b가 홀수인가?" + (b%2 == 0)); //홀수인지 물어보기//false
					
		System.out.println("b가 홀수가 아닌가?" + (b%2 != 1)); //홀수가 아닌지 물어보기//false
		System.out.println("b가 홀수가 아닌가?" + (b%2 != 0)); //홀수가 아닌지 물어보기//true
	}
	
}
