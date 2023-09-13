package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("=========== KH 사이트 ======== ");
		
		while(true) {
			System.out.println("******* 메인 메뉴 ********");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호를 입력해 주세요. : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					joinMembership();
					break;
				case 2 :
					logIn();
					memberMenu();
					break;
				case 3 :
					sameName();
					break;
				case 9 :
					System.out.println("프로그램 종료.");
					return;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void memberMenu() {
		while(true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호를 입력해주세요 : ");
			int choice = sc.nextInt();
			sc.nextLine(); //버퍼 지우기용
			
			switch(choice) {
				case 1 :
					changePassword();
					break;
				case 2 : 
					changeName();
					break;
				case 3 :
					System.out.println("로그아웃 되었습니다.\n");
					return;
				default :
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.\n");
			}
		}
	}
	
	public void joinMembership() { // equals 오버라이딩x map에 string이라 ㄱㅊ
		while(true) {
			System.out.println("\n회원가입 페이지입니다.");
			System.out.print("사용하실 아이디를 입력해주세요. : ");
			String newId = sc.nextLine();
			System.out.print("사용하실 비밀번호를 입력해주세요. : ");
			String newPw = sc.nextLine();
			System.out.print("회원님의 성함을 입력해주세요. : ");
			String newName = sc.nextLine();
			
			Member nM = new Member(newPw, newName);	//멤버객체에 담고 mb 객체생성
				//id와 객체 담기 여기호출되서 값 담고 다시 반환
			
			if(mc.joinMembership(newId, nM)) {
				System.out.println("성공적으로 회원가입 완료하였습니다.\n");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void logIn() {
		while(true) {
			System.out.println("로그인 메뉴입니다.");
			System.out.print("아이디를 입력해주세요. : ");
			String inputId = sc.nextLine();
			System.out.print("비밀번호를 입력해주세요. : ");
			String inputPw = sc.nextLine();
			
			String ssc = mc.logIn(inputId, inputPw);
		
			if(ssc != null) {
				System.out.println(ssc + "님, 환영합니다!\n");
				return;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
			return;
		}
	}
	
	public void changePassword() {
		while(true) {
			System.out.println("\n비밀번호를 바꾸는 메뉴입니다.");
			System.out.print("아이디를 입력하세요. : ");
			String id = sc.nextLine();
			System.out.print("기존의 비밀번호를 입력하세요. : ");
			String oldPw = sc.nextLine();
			System.out.print("변경하실 비밀번호를 입력하세요. : ");
			String newPw = sc.nextLine();
			
			if(mc.changePassword(id, oldPw, newPw)) {
				System.out.println("비밀번호 변경에 성공했습니다.\n");
				return;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.\n");
			}
		}
	}
	
	public void changeName() {
		while(true) {
			System.out.println("이름 변경 메뉴입니다.");
			System.out.print("아이디를 입력하세요. : ");
			String id = sc.nextLine();
			System.out.print("비밀번호를 입력하세요. : ");
			String pw = sc.nextLine();
			
			String userName = mc.logIn(id, pw);
			if(userName != null) {
				System.out.println("현재 이름 : " + userName); // 해당 아이디와 비밀번호에 저장되어있는 네임
				System.out.print("변경하실 이름을 입력하세요. : ");
				String newName = sc.nextLine();
				
				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공하였습니다.\n");
				break;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.\n");
			}
			return;
		}
	}
	
	public void sameName() {	// map을 넣자
		System.out.println("\n같은 이름 회원 찾기 메뉴입니다.");
		System.out.print("검색할 이름을 입력하세요. : ");
		sc.nextLine();
		String nameSearch = sc.nextLine();
		System.out.println(mc.sameName(nameSearch));
		
		//트리의 객체 값을 각각 뽑아야하는데..
		
		// 아래는 강사님 답안
		// 반환되기 전 TreeMap은 HashMap에서 TreeMap의 값을 찾아서 보내주기 위함이고
		// 여기서 반환받은 값을 TreeMap 안에서 찾기 위해 한번더 반복문을 돌려서 찾는거다.
	}
	
	public void sameName2() {
		System.out.println("\n같은 이름 회원 찾기 메뉴입니다.");
		System.out.print("검색할 이름을 입력하세요. : ");
		String searchName = sc.nextLine();
		
		TreeMap<String, Member> map = mc.sameName2(searchName);
		Set<Entry<String, Member>> set = map.entrySet();
		Iterator<Entry<String, Member>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String, Member> e = it.next();
			System.out.println(e.getValue().getName() + "-" + e.getKey());
		}
	}
}
