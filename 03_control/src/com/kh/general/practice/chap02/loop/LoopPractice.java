package com.kh.general.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		//값은 1부터 크거나 같다 정수
		// 1 미만 숫자 입력 시 오류로 처리
		
		System.out.print("양수를 입력해주세요 : ");
		int i = sc.nextInt();
		
		if(i >= 1) {
			for(int j = 1; j <= i; j++) {
				System.out.println(j);
			}
		} else {
				System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 : ");
		int input = sc.nextInt();

		for(; input <= 0;) {
			System.out.println("양수를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력해주세요 : ");
			input = sc.nextInt();
		}
		for(int out = 1; out <= input; out++) {
			System.out.println(out);
		}
	}

	
	public void practice3() {
		// 임의의 정수 입력 후 거꾸로 1까지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >=1 ) {
		for(int out = input; out >= 1; out--) {
			System.out.println(out);
			}
		} else {
			System.out.print("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice4() {
		//위와 같은 조건에서 반복문사용
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for (;input <= 0;) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("다시 입력해주세요. : ");
				input = sc.nextInt();
		}
		for (int out = input; out >= 1; out--) {
			System.out.println(out);
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum = sum + i;				// if문 안에 있으면 아래에서 조건이 input-1까지 이므로 input-1까지의 합만 적용되서 포문 아래로 나와한다
			if( i < input) {
			System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int fs = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int sd = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (fs > sd) {
			max = fs;
			min = sd;
		} else {
			max = sd;
			min = fs;
		}
		
		if(fs < 1 || sd < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for (int i = min; i <= max; i++ ) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int fs = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int sd = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (fs > sd) {
			max = fs;
			min = sd;
		} else {
			max = sd;
			min = fs;
		}
		
		for(; fs < 1 || sd < 1;)	{
			System.out.println("1이상의 숫자를 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			fs = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			sd = sc.nextInt();
		}
		
		for (int i = min; i <= max; i++ ) {
				System.out.print(i + " ");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; i ++)
			System.out.println(dan + " x " + i + " = " + (dan*i));
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 단을 입력하세요 : ");
		int dan = sc.nextInt();
		if (dan <= 9)	{
			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j <= 9; j ++)	{
					System.out.println(i + " X " + j + " = " + (i*j));
				}
			}
		} else {
			System.out.print("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		for(;dan > 9 ;) {
			System.out.print("9 이하의 숫자만 입력해주세요 : ");
			dan = sc.nextInt();
		}
		for (int i = dan; i <= 9; i++) {
			System.out.println("===== " + i + "단 =====");
			for (int j = 1; j <= 9; j ++)	{
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
	
	public void practice11 () {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 입력 : ");
		int start = sc.nextInt();
		System.out.print("공차 입력 : ");		//수열의 일정한 차이값
		int wide = sc.nextInt();
											//a 숫자에 b만큼 더하는거 유지할거면 증감식에도 값을 넣어주는 식이 필요
		for(int j = start; j < (11*wide) ; j = j + wide) {
			System.out.print(j + " ");
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 : ");
		String str = sc.next();
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
//		String str1 = // 연산자 4개를 하나의 변수에 넣자
		
		if(str.equals("exit")) {			
			System.out.println("프로그램을 종료합니다.");			
		} else if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) { 	//연산자를 잘못 입력하면? 
				if(str.equals("/")) {
					if( num2 == 0) {
						for(;num2 == 0;) {
							System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
							System.out.print("연산자 : ");
							str = sc.next();
							System.out.print("정수1 : ");
							num1 = sc.nextInt();
							System.out.print("정수2 : ");
							num2 = sc.nextInt();
						} 
				} else if (num2 >= 0) {
					System.out.println(num1 + " + " + num2 + " = " + (num1/num2));
				}
			} else {
				switch(str)	{
				case "+" :					
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case "-" :
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;					
				case "*" :
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
				}
			}
		}
	}
	
	public void practice12_1() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int num1 = 0;
		int num2 = 0;
		
		//for문으로 예외처리 해주기 -> 예외문구 생각해보기	//구동안됨
		for(;str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");)
			System.out.print("연산자(+, -, *, /, %: ");
			str = sc.next();
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();

				switch(str) {
				case "+" :
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case "-" :
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case "*" :
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
				case "/" :
					if ( str.equals("/") && num2==0) {
						System.out.print("0을 나눌 수는 없습니다.");
					} else {
						System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
					}
					break;
				case "%" :
					System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
					break;
				default :
					System.out.println("없는 연사자입니다. 다시 입력해주세요.");
			}
		}

		public void practice12_2() {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("연산자(+, -, *, /, %) : ");
				String op = sc.nextLine();
				
				if(op.equals("exit")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();
				sc.nextLine();
			
				switch(op) {
				case "+" :
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case "-" :
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case "*" :
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
				case "/" :
					if(num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					} else {
					System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
					}
					break;
				case "%" :
					System.out.println(num1 + "%" + num2 + " = " + (num1%num2));
					break;
				default :
					System.out.println("없는 연사자입니다. 다시 입력해주세요.");
				}
			}
		}
}

