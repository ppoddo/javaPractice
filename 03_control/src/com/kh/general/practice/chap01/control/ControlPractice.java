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
}
