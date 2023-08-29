package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void method() {

	Scanner sc = new Scanner(System.in);
	
	/*	System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
//		char ch;
		int n = 0;
		int i = (1);
		char ch = str.charAt(i);

	
		System.out.println("첫 번째 문자 : " + ch);
		System.out.println("두 번째 문자 : " + ch);
		System.out.println("세 번째 문자 : " + ch); */
	
		
	/*	System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		char ch;
		int num = 0;
		ch = str.charAt(num);
		System.out.println("첫 번째 문자 : " + ch);
		num++;
		ch = str.charAt(num);
		System.out.println("두 번째 문자 : " + ch);
		num++;
		ch = str.charAt(num);
		System.out.println("세 번째 문자 : " + ch); // for문을 사용하지 않는
	} */
	
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		char ch;
		
		for(int i = 0; i < 10; i++ ) {
			ch = str.charAt(i);		
			System.out.println((i+1)+"번째 문자 : " + ch);
							
		}
		
		System.out.print(str);
	}
	
}
