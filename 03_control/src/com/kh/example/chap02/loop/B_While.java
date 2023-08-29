package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	public void method1() {
		// 1부터 5까지 출력
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while(j <= 5);
	}
	
	public void method2() {
		// 	5부터 1까지 출력
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		
		int j = 5;
		do {
			System.out.println(j);
			j++;
		} while(j >= 1);
	}
	
	public void method3() {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int start = sc.nextInt();
		System.out.print("정수 1 입력 : ");
		int end = sc.nextInt();
		
		if (start > 0 && end >0) {
			int max = 0; 
			int min = 0;
			
			if(start > end) {
				max = start;
				min = end;
			} else if(start < end) {
				max = end;
				min = start;
			}

			while (min <= max) {
				System.out.print(min + " ");
				min++;
			} 
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void method4() {
		//	정수를 하나 입력 받아 그 수가 1~9 사이의 수일때만 그 수의 구구단 출력
		//	조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		
		if (num1 >= 1 && num1 <= 9) {
			System.out.println(num1 + "단을 출력합니다.");
			int i = 1;
			while (i <= 9)	{
				System.out.println(num1 + " * " + i + " = " + (num1*i));
				i++;
			}		
		} else {
			System.out.println("1~9 사이의 양수를 입력하셔야 합니다.");
		}
	}
	
	public void method5() {
		// 문자열을 입력받아 인덱스 별로 문자 출력
		// ex. 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}
	}
			//문자열.length == 문자열의 길이만큼~ 이라는 뜻 ㅇㅇ
	public void method5_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		int i = 0;
		while(i < str.length()) {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 9) {
			System.out.println("======메뉴======");
			System.out.println("1. 1~5 출력");
			System.out.println("2. 5~1 출력");
			System.out.println("3. 정수 사이 출력");
			System.out.println("4. 구구단 출력");
			System.out.println("5. 문자열 인덱스 출력");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 4 : method4(); break;
			case 5 : method5(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void method6_1() {
		Scanner sc = new Scanner(System.in);
			
		int menu = 0;
		while(true) {
			System.out.println("======메뉴======");
			System.out.println("1. 1~5 출력");
			System.out.println("2. 5~1 출력");
			System.out.println("3. 정수 사이 출력");
			System.out.println("4. 구구단 출력");
			System.out.println("5. 문자열 인덱스 출력");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 4 : method4(); break;
			case 5 : method5(); break;
			case 9 : System.out.println("종료합니다."); return; //return 중요함 return할 때 값을 가지고 돌아감.
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void method7() {		//do while로 바꿔보기
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("======메뉴======");
			System.out.println("1. 1~5 출력");
			System.out.println("2. 5~1 출력");
			System.out.println("3. 정수 사이 출력");
			System.out.println("4. 구구단 출력");
			System.out.println("5. 문자열 인덱스 출력");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 4 : method4(); break;
			case 5 : method5(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		} while(menu != 9);
	}
	
	public void method8() {		//while문
		//	키보드로 문자열 값을 입력 받아 문자열의 길이 출력
		//	이때 exit를 입력하면 반복 종료
		Scanner sc = new Scanner(System.in);
		String str = "";
		
//		String str = null;  			//참조 자료형의 기본값은 null로 사용한다.
										//값이 없으면 null값(아무것도 없다는 지칭)을 넣는다.
//		String str = "";				//"" 데이터가 들어가있다.
		
		//null pointer exception - 가져올게 없다 - 참조할게 없다.
		
		while (!str.equals("exit")) {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println(str + "의 길이 : " + str.length());	
		}
	}
	
	public void method8_1() {
		//
		Scanner sc = new Scanner(System.in);
		String str = null;
		sc.nextLine().toUpperCase().equals(str);
		while (!str.equals("exit")) {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println(str + "의 길이 : " + str.length());	
		}
	}
	
	public void method9() {			//do while문
		Scanner sc = new Scanner(System.in);
		String str = "";
		do { 
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println(str + "의 길이 : " + str.length());
			
		} while (!str.equals("exit"));
	}
	
	public void method9_1() {			//do while문 + null값을 넣었음.
										//조건식을 확인하기 전에 일단 실행해서 str값에 내 입력값이 들어가고 나서 조건식을 확인하기 때문에 오류가 안남.
		Scanner sc = new Scanner(System.in);
		String str = null;
		do { 
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println(str + "의 길이 : " + str.length());
			
		} while (!str.equals("exit"));
	}
}
