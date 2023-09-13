package com.kh.practice.file.view;

import java.io.FileReader;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		int menu = 0;
		while(menu != 9) {
			System.out.println("******** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : fileSave();
				break;
			case 2 : fileOpen();
				break;
			case 3 : fileEdit();
				break;
			case 9 : System.out.println("프로그램을 종료합니다.");
				break;
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("종료하고 싶으시면 ex끝it 를 입력하면 종료됩니다.");
		System.out.print("내용 : ");
		String content = "";
		while(true) {
			String input = sc.nextLine();
			if(input.equals("ex끝it")) {
				break;
			}
			content += input + "\n";
		}
		String answer = null;
		do {
			System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();
			boolean exist = fc.checkName(fileName);
			if(exist) {	// 파일 존재할 때
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				answer = sc.nextLine();
				if(answer.equalsIgnoreCase("y")) {
					fc.fileSave(fileName, content);
				} 
			} else {		//파일이 존재하지 않을 때
				fc.fileSave(fileName, content);
				break;	//else문은 파일 완성을 말하므로 break; 를 사용해서 반복문 빠져나가기
			}
		} while(!answer.equalsIgnoreCase("y"));
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		boolean exist = fc.checkName(fileName);
		if(exist) {
			System.out.println(fc.fileOpen(fileName));
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		boolean exist = fc.checkName(fileName);
		if(exist) {
			System.out.println("파일에 수정할 내용을 입력하세요.");
			System.out.println("종료하고 싶으시면 ex끝it 를 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String content = "";
			while(true) {
				String input = sc.nextLine();
				if(input.equals("ex끝it")) {
					break;
				}
				content += input + "\n";
			}
			
			fc.fileEdit(fileName, content);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}

}
