package com.kh.example.chpa01.condition;

import java.util.Scanner;

public class A_If {
	public void method1() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력(연.실3 참조)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
//		if(num % 2 == 0) {
//			System.out.println("입력하신 숫자는 짝수입니다.");
//		} 
//		if(num % 2 != 0) {
//			System.out.println("입력하신 숫자는 홀수입니다.");
//		}		
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다.");	
		}
	}	
	
	public void method2() {
		// 키보드로 입력한 숫자가 양수인지 0인지 음수인지 출력(연.실1,2)
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력 하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");			
		} else if(num == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		} else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
	
	}
	
	public void method3() {
		// 주민번호를 입력 받아 여자인지 남자인지 출력(연.실8)
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String pId = sc.nextLine();
		char gender = pId.charAt(7);
		
		if(gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if(gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void method4() {
		// 성별을 입력 받아 남학생인지 여학생인지 출력(연.실5)
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		if (gender == 'M' || gender == 'm') {
			System.out.println("남학생입니다.");
		} else if (gender == 'F' || gender == 'f') {
			System.out.println("여학생입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void method5() {
		// 이름을 넣어 본인인지 확인
		// 입력한 값이 내 이름과 같으면 "본인입니다" 출력
		// 같지 않으면 "본인이 아닙니다" 출력
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("성함을 입력해주십시오.");
		String name = sc.nextLine();
		
		if ( name == "임화진" || name == "임 화진" || name == "화진") {
			
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
	}
	// 구동이 안된 이유 "=="는 기본자료형을 사용할 때만 값을 비교해주는 연산자로 사용
	// String을 포함한 참조자료형(클래스)에서 "=="는 주소값을 사용하게 하는 것.
	// 문자열 비교에서만 equals() 를 사용해야함. 중요함    
	 * 변수.equals() = 변수가 () 안에 있는거랑 같니? -> equals는 boolean타입을 지님 - 때문에 조건식 안에 사용가능 											*/
		Scanner sc = new Scanner(System.in);
		System.out.print("성함을 입력해주십시오 : ");
		String name = sc.nextLine();
		
		if(name.equals("임화진")) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}			
	
	/*	if(!name.equals("임화진")) {
	 * // 논리부정연산자 ! 를 조건식 안에 변수명 앞에 넣어서 논리를 뒤집어서 사용가능. 개념을 헷갈리지 말 것.
	   // 임화진을 입력했으면 값은 false로 연산, 그렇지 않으면 값이 true로 뒤바뀌어 if안이 열림
			System.out.println("본인이 아닙니다..");
		} else {
			System.out.println("본인입니다.");
		}			
	}     */
	}
	
	// 중간 중간 스페이스바를 넣어도 가능하게 만드는 법은?
	public void method15() {	//내 아이디어
		Scanner sc = new Scanner(System.in);
		System.out.print("성함을 입력해주십시오 : ");
		String name = sc.nextLine();
		char ch1 = name.charAt(0);
		char ch2 = name.charAt(1);
		char ch3 = name.charAt(2);
		
		if ( ch1 == '임' && ch2 == '화' && ch3 == '진') {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}	
	}
	
	
	
	
	

}
