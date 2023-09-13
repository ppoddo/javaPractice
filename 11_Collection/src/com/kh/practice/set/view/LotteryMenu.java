package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("******* 메인 메뉴 ********");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 확인");
			System.out.println("3. 추첨 대상 삭제");
			System.out.println("4. 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum =Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
				case 1 : 
					insertObject();
					break;
				case 2 : 
					selectAll();
					break;
				case 3 : 
					deleteObject();
					break;
				case 4 : 
					winObject();
					break;
				case 5 : 
					searchWinner();
					break;
				case 9 : 
					System.out.println("프로그램 종료");
					break;
				default :
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		} 
	}
	
	public void insertObject() {
		int count = 0;
		while(true) {
			System.out.println("추첨 대상을 추가합니다");
			System.out.print("추첨자 이름 : ");
			String name = sc.nextLine();
			System.out.print("추첨자 핸드폰 번호('-'제외) : ");
			String phone = sc.nextLine();
			
			Lottery l = new Lottery(name, phone);
			boolean result = lc.insertObject(l);
			
			if(!result) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				continue;
			} 
			
			count++;
			String answer = null;
			do {
				System.out.print("더 추가하시겠습니까?(Y/N) : ");
				answer = sc.nextLine();
				if(answer.toUpperCase().equals("Y")) {
					break;
				} else if(answer.toUpperCase().equals("N")) {
					System.out.println(count + "명 추가 완료되었습니다.");
					return;
				} else {
					System.out.println("Y나 N중에서 대답해주세요.");
				}
			} while(!answer.toUpperCase().equals("N"));
		}
	}
	
	public void selectAll() {
		HashSet<Lottery> set = lc.selectAll();
		if(set.isEmpty()) {
			System.out.println("추첨 대상자가 없습니다.");
		} else {
			Iterator<Lottery> it =set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
	
	public void deleteObject() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'제외) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		if(lc.deleteObject(l)) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void winObject() {
		HashSet<Lottery> win = lc.winObject();
		if(win == null) {
			System.out.println("추첨 대상이 4명 이상이 되어야 합니다.");
		} else {
			System.out.println(win);
		}
	}
	
	public void searchWinner() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'제외) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name, phone);
		if(lc.searchWinner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
