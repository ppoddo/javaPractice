package com.kh.operater;

import java.util.Scanner;

public class F_Triple {
	public void method() {
		// 입력한 정수가 짝수인지 홀수인지 판별
		// 홀수이면, 홀수입니다 출력
		// 짝수이면, 짝수입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		
		System.out.println(num + "은(는) " + result);
		
		
		
	}
}
