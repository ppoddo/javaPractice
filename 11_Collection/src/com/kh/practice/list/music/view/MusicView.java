package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		int menuNum = 0;
		do {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선태 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
				case 1 :
					addList();
					break;
				case 2 :
					addAtZero();
					break;
				case 3 :
					printAll();
					break;
				case 4 :
					searchMusic();
					break;
				case 5 :
					removeMusic();
					break;
				case 6 :
					setMusic();
					break;
				case 9 :
					System.out.println("종료");
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while(menuNum != 9);
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ********");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		if(mc.addList(m)) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ********");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		if(mc.addAtZero(m) == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
		
	public void printAll() {
		System.out.println("******* 전체 곡 목록 출력 ********");
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.println("******** 특정 곡 검색 ********");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		if(m == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.printf("검색한 곡은 %s, %s입니다.%n", m.getTitle(), m.getSinger());
		}
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		if(m == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.printf("%s, %s을(를) 삭제했습니다.%n", m.getTitle(), m.getSinger());
		}
	}
		
	
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String search = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String singer = sc.nextLine();
		Music m = new Music(title, singer);
		
		Music setMusic = mc.setMusic(search, m);
		if(setMusic == null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.printf("%s, %s의 값이 변경되었습니다.%n", setMusic.getTitle(), setMusic.getSinger());
		}
	}
}
