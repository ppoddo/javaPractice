package com.kh.general.practice.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;	
		while(menu != 7) {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.print("메뉴 번호를 입력하세요:");
			menu = sc.nextInt();
			switch(menu) {
			case 1 :
				System.out.println("입력메뉴입니다.");
				break;
			case 2 :
				System.out.println("수정메뉴입니다.");
				break;
			case 3 :
				System.out.println("조회메뉴입니다.");
				break;
			case 4 :
				System.out.println("삭제메뉴입니다.");
				break;	
			case 7 :
				System.out.println("프로그램이 종료됩니다.");
				break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요 : ");
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kNum = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mNum = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eNum = sc.nextInt();
		
		int sum = kNum + mNum + eNum;
		double av = (kNum + mNum + eNum)/3;
		
		if(kNum >= 40 && mNum >= 40 && eNum >= 40 && av >= 60) {
			System.out.println("국어 점수 : " + kNum);
			System.out.println("수학 점수 : " + mNum);
			System.out.println("영어 점수 : " + eNum);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + av);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 12, 1, 2 :
			System.out.print(num + "월은 겨울입니다");
			break;
		case 3, 4, 5 :
			System.out.print(num + "월은 봄입니다");
			break;
		case 6, 7, 8 :
			System.out.print(num + "월은 여름입니다");
			break;
		case 9, 10, 11 :
			System.out.print(num + "월은 가을입니다");
			break;
		default :
			System.out.print(num + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {		//문자열은 equals 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String psw = sc.nextLine();
		
		String myId = "hwajin";
		String myPsw = "hwajin123";
		
		if(id.equals(myId) && psw.equals(myPsw)) {
			System.out.print("로그인 성공");
		} else if(!id.equals( myId)) {
			System.out.print("아이디가 틀렸습니다.");
		} else {
			System.out.print("비밀번호가 틀렸습니다.");
		}
		
		
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String auth = sc.nextLine();
		if(auth.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if(auth.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if(auth.equals("비회원")) {
			System.out.println("게시글 조회");
		}
	}
	public void practice6_1() {		//case문에 해당하는 줄에 들어가 break가 없다면 내려가는 특성을 활용
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String auth = sc.nextLine();
		
		switch(auth) {		
		case "관리자" :
			System.out.print("회원관리, 게시글 관리");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성");
		case "비회원" :
			System.out.print("게시글 조회");
			break;						// 브레이크 안걸면 디펄트 값이 항상 출력되므로 걸어줌.
		default :									
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m) : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg) : ");
		double k = sc.nextDouble();
		
		double BMI = (k / (m*m));		//BMI 측정
		
		if(BMI < 18.5) {
			System.out.println(BMI);
			System.out.println("저체중 입니다.");
		} else if(BMI < 23) {
			System.out.println(BMI);
			System.out.println("정상체중 입니다");
		} else if(BMI < 25) {
			System.out.println(BMI);
			System.out.println("과체중 입니다");
		} else {
			System.out.println(BMI);
			System.out.println("고도비만 입니다");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		System.out.println("연산기호(+, -, *, /, %) : ");
		String op = sc.next();
		
		if( num1 > 0 && num2 >0) {
			switch(op) {
			case "+" :
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-" :
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*" :
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/" :
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case "%" :
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;
			default :
				System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			}
		} else {
			System.out.print("잘못입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		System.out.println("============ 결과 =============");
		if(attend < 20 * 0.7) {
			System.out.println("Fail [출석 횟수 부족 (" + attend + "/20)]");
		} else {
			double calcMid = mid * 0.2;
			double calcFin = fin * 0.3;
			double calcHw = hw * 0.3;
			double calcAttend = attend/20.0 * 100 * 0.2; // == attend
			System.out.println("중간 고사 점수(20) : " + calcMid);
			System.out.println("기말 고사 점수(30) : " + calcFin);
			System.out.println("과제 점수(30) + " + calcHw);
			System.out.println("출석 점수(20) + " + calcAttend);
			
			double sum = calcMid + calcFin + calcHw + calcAttend;
			
			System.out.println("총점 : " + sum);
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
			System.out.println("Fail [점수 미달]");
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======메뉴화면입니다======");
		System.out.println("1. 메뉴 출력 ");
		System.out.println("2. 짝수/홀수 ");
		System.out.println("3. 합격/불합격 ");
		System.out.println("4. 계절 ");
		System.out.println("5. 로그인 ");
		System.out.println("6. 권한 확인 ");
		System.out.println("7. BMI ");
		System.out.println("8. 계산기 ");
		System.out.println("9. P/F ");
				
		System.out.println("호출하실 메소드 번호를 눌러주세요 : ");
		int bell = sc.nextInt();
		
		switch(bell) {
		case 1 :
			System.out.println("1. 메뉴 출력 : ");
			practice1();
			break;
		case 2 :
			System.out.println("2. 짝수/홀수 : ");
			practice2();
			break;
		case 3 :
			System.out.println("3. 합격/불합격 : ");
			practice3();
			break;
		case 4 :
			System.out.println("4. 계절 : ");
			practice4();
			break;
		case 5 :
			System.out.println("5. 로그인 : ");
			practice5();
			break;
		case 6 :
			System.out.println("6. 권한 확인 : ");
			practice6();
			break;
		case 7 :
			System.out.println("7.  BMI : ");
			practice7();
			break;
		case 8 :
			System.out.println("8. 계산기 : ");
			practice8();
			break;
		case 9 :
			System.out.println("9. P/F : ");
			practice9();
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
