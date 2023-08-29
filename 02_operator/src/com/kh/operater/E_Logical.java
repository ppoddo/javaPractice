package com.kh.operater;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// 입력한 정수 값이 1~100 사이 숫자인가
		// 1~100 --> 1보다 크거나 같고 100보다 작거나 같은지
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		boolean result1 = (num >= 1 && num <= 100);
		System.out.println("1부터 100 사이인지 확인 : " + result1);
	
	}
	public void method2() {
		// 입력한 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);		
		boolean result2 = (ch <= 'Z' && ch >= 'A');	//두 가지 조건의 값이 true면 true
//		boolean result2 = (ch <= 90 && ch >= 65);	//
		
		System.out.println("영어 대문자인가요? : " + result2);
		
		//새로 입력받은 ch2 값이 Y나 y이면 계속 진행하겠다는 안내문구 출력
		
		System.out.print("계속 하시려면 Y나 y를 입력하세요 : ");
		char ch2 = sc.nextLine().charAt(0);
		boolean result3 = (ch2 == 'y' || ch2 == 'Y');	//y이거나 Y 둘중에 하나라도 입력되면 true
//		boolean result3 = (ch2 == '121' || ch2 == '89');	
		
		System.out.println("계속 하겠다고 하셨습니까? : " + result3);
		
		
		
		
		
		
		
		
	}
}
