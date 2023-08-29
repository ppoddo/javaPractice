package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	public void method1() {
		// 1부터 5까지 출력
		
		for(int i = 1; i < 6; i++) {
			System.out.println(i);
		}
	}
	
	public void method1_1() {
			// 자기소개 다섯 번 하기 : 내 이름은 임화진이야
		for(int i = 0; i < 5; i++) {
			System.out.println("내 이름은 임화진이야");
		}
	}	
	
	public void method2() {
		// 5부터 1까지 출력
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	public void method2_1() {
		// 8부터 3까지 출력
		for(int i = 8; i > 2; i--) {
			System.out.println(i);
		}
	}
	
	public void method2_2() {			// 위와 표현하는 방식만 다를 뿐 같은 조건이다.
		// 8부터 3까지 출력
		for(int i = 0; i < 6; i++) {
			System.out.println(8 - i);
		}
	}
	
	public void method3() {
		// 1에서 10사이의 홀수만 출력
		for(int i = 1; i < 11; i += 2) {
			System.out.println(i);
		}	
	}
	
	public void method3_1() {			//위와 같은 값을 가진 표현방식
		// 1에서 10사이의 홀수만 출력
		for(int i = 1; i < 11; i += 2) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}	
	
	}
	
	public void method4() {			//어제 해결하지 못한 메소드의 해답이 될 수 있을 듯.
		//	정수 두 개를 입력 받아 그 사이 숫자 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자를 두 번째 숫자보다 작게 입력해주세요.");
		
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();

//		for(int num1 = start; num1 <= end; num1++) {
//			System.out.println(num1);
//		}
					// 두 숫자를 비교할 때 사용할 수 있는 용도
		int max = 0; // 더 큰 숫자
		int min = 0; // 더 작은 숫자
		if(start < end) {
			max = end;
			min = start;
		} else { 	//start >= end
			max = start;
			min = end;
		}
				//두 변수의 값을 따져서 큰 숫자와 작은 숫자를 나누고 알맞는 범위에 끼워맞춰놓고 for문 실행
		for(int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}
	
	public void method4_1() {
		//	정수 하나를 입력 받아 그 수가 1~9 사이의 숫자일 때만 그 수의 구구단 출력
		//	조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력(1~9) : ");
		int i = sc.nextInt();
		
		if(i < 10 && i > 0) { 
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");			
		}
	}
		
	public void method5() {
		// 2단부터 9단까지 출력
		System.out.println("****구구단****");
		for(int num1 = 2; num1 <= 9; num1++) {
			System.out.println(num1 + "단을 출력 합니다.");
			for(int num2 = 1; num2 <= 9; num2++) {
				System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
			}
		}	
	}
	
	public void method6() {
		// 아날로그 시계 : 0시 0분 ~ 23시 59분까지
		System.out.println("아날로그 시계");
		for(int h = 0; h < 24; h++) {
			for(int m = 0; m < 60; m++) {
				System.out.printf("%d시 %d분입니다.\n", h, m);
			}	
		}
	}
	
	public void method7() {
		//	한 줄에 *가 5번 출력되는데
		//	그 줄은 사용자가 입력한 수 만큼 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 입력 : ");
		int key = sc.nextInt();
		
		for(int i = 1; i <= key; i++) {

			for(int j = 1; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();			//안for문이 완료 된 후 줄뜨기 하고 바깥포문으로 올라가라 라는 뜻.
		}
	}
	
	public void method8() {
		// 한 줄에 별표 문자를 입력된 줄 수와 칸 수 만큼 출력
		// 단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수를 입력해주세요. : ");
		int i = sc.nextInt();
		System.out.print("칸 수를 입력해주세요. : ");
		int j = sc.nextInt();
		
		for(int num1 = 1; num1 <= i; num1++) {
			for(int num2 = 1; num2 <= j; num2++) {	
				if(num1 == num2) {
					System.out.print(num1);
				} else
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
