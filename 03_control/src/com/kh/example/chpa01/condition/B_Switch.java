package com.kh.example.chpa01.condition;

import java.util.Scanner;

public class B_Switch {
	public void method1() {
		// 정수 두 개와 연산 기호 문자 1개를 입력 받아서
		// 연산 기호 문자에 해당하는 계산 수행 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/,) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
	/*	if(op == '+') {
			
		} else if(op == '-') {
			
		}	*/ // if문으로도 활용가능 but, 조건식을 가독성이 좋게 만들어주는데 switch 사용
		
		switch(op) {				//스위치도 중첩 가능.if도 가능.
									// 또한 모든 스위치문은 if문으로 바꿀 수 있지만 모든 if문을 스위치로 바꿀 수는 없다.
									//스위치에서는 문자, 문자열, 정수를 받아서 일치하는지를 보지만 if문 중에 범위를 설정하는 구문은 스위치로 표현하지 못함.
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;	// 마지막 구문이라 break;를 생략해도 됨.
		}
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("KH 과일가게에 오신걸 환영합니다~");
		System.out.println("사과, 바나나, 복숭아, 키위가 있어요! 편하게 가격 물어보세요!");
		System.out.println("어떤 과일의 가격이 궁금하신가요? : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		// 사과 1000 / 바나나 3000 / 복숭아 2000 / 키위 5000
		switch(fruit) {
		
		case "사과" :
			price = 1000;
			break;
			
		case "바나나" :
			price = 3000;
			break;
			
		case "복숭아" :
			price = 2000;
			break;
			
		case "키위" :
			price = 5000;
			break;
		default :
			System.out.println("해당 과일은 판매하지 않습니다ㅠㅠ");
		}
		
		System.out.println(fruit + "의 가격은 " + price + "입니다.");
	}
	public void method3() {
		// 1~12까지의 숫자를 사용자에게 입력 받으면 해당 달의 마지막 날짜 출력
		// 8 --> 입력하신 달은 31일까지입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("원하시는 달(숫자만)을 입력해주세요. : ");
		int month = sc.nextInt();
		int day = 0;
								//같은 값을 가진 여러 가지 case는 묶어서 표현 가능
								//case 1, 3, 5  or case 1: case 3: case 5: 같은 표현 가능
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 :
			day = 31;
				break;
		case 4, 6, 9, 11 :
			day = 30;
			break;
		case 2 :
			day = 28;
			break;
		default : 
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1~12 사이의 숫자를 입력해주세요.");
		}
		if(month > 0 && month <= 12) {
		System.out.printf("입력하신 %d월은 %d일까지 입니다.", month, day);	
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** 메뉴 ********");
		System.out.println("1. 간단 계산기");
		System.out.println("2. 과일 가게");
		System.out.println("3. 달의 마지막 날");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {				// 메소드를 케이스 안에 넣어서 기능시킬 수 있다.
		case 1 :					// 같은 클래스면 메소드명만 호출o, 다른 곳이면 클래스명을 선언하고 메소드명 호출
			System.out.println("간단 계산기입니다.");
			method1();
			break;
		case 2 :
			System.out.println("과일 가게입니다.");
			method2();
			break;
		case 3 :
			System.out.println("마지막 날짜입니다.");
			method3();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
