package com.kh.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int i = 1;
		
		for(i = 1; i <= num; i++)	{
			if(i%2==0) {			//짝수일때
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
		if(num < 1) {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				for(int i = 1; i <= num; i++)	{
					if(i%2==0) {			//짝수일때
						System.out.print("수");
					} else {
						System.out.print("박");
					}
					if(i==num) {
						System.out.println(" ");
						break;
					}
				} 
			}
		}
	}
	
	public void practice3() {
		//사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력받아
		//해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(str + " 안에 포함된 " + ch + "개수 : " + count);
	}
	
	public void practice4() {
		//더 하시겠습니까?를 물어봐서 n N 종료 y Y 진행
		//나머지 다른 문자는 다시 입력
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0); //문자열과 문자를 비교하려면 같은 문자열로 맞춰주기
		
			int count = 0;
		
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch) {
					count++;
				}	
			}
			System.out.println(str + " 안에 포함된 " + ch + "개수 : " + count);
			
			System.out.println("더 하시겠습니까? (Y/N): ");
			String continueInput = sc.nextLine();
									//	문자열이니까 더블쿼테이션 사용
			if(continueInput.equals("y")||continueInput.equals("Y")) {
				System.out.println("다시 시작합니다");
			} else if(continueInput.equals("n") || continueInput.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		sc.close();
	}
}