package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();		//버퍼에 개행문자 처리용;;
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("y")) {
			System.out.print(scr.confirmData());
		} else if (input.equalsIgnoreCase("n")) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
