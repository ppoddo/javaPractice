package com.kh.homework.member.view;

import java.util.Scanner;

import com.kh.homework.member.controller.MemberController;
import com.kh.homework.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		int num = mc.existMemberNum() ;
		int input = 0;

			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
		do {
			if(num == 10) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			} else {
				System.out.println("1. 새 회원 등록");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : 
				if(num == 10) {
					System.out.println("회원 수가 가득찼습니다. 다른 메뉴를 선택해주세요");
				} else {
				insertMember();
				break;
				}
			case 2 :
				searchMember();
				break;
			case 3 :
				updateMember();
				break;
			case 4 :
				deleteMember();
				break;
			case 5 :
				printAll();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while(input == 9);
	}
	
	public void insertMember() {	
		boolean idDup = false;
		String id = "";
		String gender = "";
		do {
			System.out.print("가입할 아이디 : ");
			id = sc.nextLine();
			idDup = mc.checkId(id);
			if(idDup) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			} 
		} while(idDup);
		System.out.print("가입할 이름 : ");
		String name = sc.nextLine();
		System.out.print("가입할 비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("가입할 이메일 : ");
		String email = sc.nextLine();
		
		boolean isGenderValid = false;
		do {
			System.out.print("가입할 성별 : ");
			gender = sc.nextLine().toLowerCase();
			if(gender.equals("m") || gender.equals("f")) {
				isGenderValid = true;
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}while(!isGenderValid);
		System.out.print("가입할 나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
		System.out.println("회원등록이 완료되었습니다.");
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색");
		System.out.println("2. 이름으로 검색");
		System.out.println("3. 이메일로 검색");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		switch(input) {
			case 1 : 
				searchId();
				break;
			case 2 : 
				searchName();
				break;
			case 3 : 
				searchEmail();
				break;
			case 9 : 
				System.out.println("메인으로 돌아갑니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다.");
				return;
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력 : ");
		String inputId = sc.nextLine();
		String id = mc.searchId(inputId);
		if(id.equals(null)) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(id);
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름을 입력 : ");
		String inputName = sc.nextLine();
		Member[] name = mc.searchName(inputName);
		if(name == null) {
			System.out.println("찾으신 회원이 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(name);
		}
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일을 입력 : ");
		String inputEmail = sc.nextLine();
		Member[] email = mc.searchEmail(inputEmail);
		if(email == null) {
			System.out.println("찾으신 회원이 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(email);
		}
	}
	
	public void updateMember() {
		int num = 0;
		do {
			System.out.println("회원 수정 메뉴입니다.");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			switch(num) {
				case 1 :
					updatePassword();
					break;
				case 2 :
					updateName();
					break;
				case 3 :
					updateEmail();
					break;
				case 9 :
					System.out.println("메인으로 돌아갑니다.");
					return;
				default :
					System.out.println("잘못 입력하셨습니다.");
					return;
			}
		} while(num == 9);
	}
	
	public void updatePassword() {
		System.out.println("비밀번호 변경메뉴입니다.");
		System.out.print("수정할 아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("새로운 비밀번호 입력 : ");
		String pw = sc.nextLine();
		
		boolean update = mc.updatePassword(id, pw);
		
		if(update) {
			System.out.println("비밀번호가 성공적으로 수정되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}
	
	public void updateName() {
		System.out.println("이름 변경메뉴입니다.");
		System.out.print("수정할 아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("새로운 이름 입력 : ");
		String name = sc.nextLine();
		
		boolean update = mc.updateName(id, name);
		if(update) {
			System.out.println("이름이 성공적으로 수정되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}
	
	public void updateEmail() {
		System.out.println("이메일 변경메뉴입니다.");
		System.out.print("수정할 아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("새로운 이메일 입력 : ");
		String email = sc.nextLine();
		
		boolean update = mc.updateEmail(id, email);
		if(update) {
			System.out.println("이메일이 성공적으로 수정되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}
		
	public void deleteMember() {
		System.out.println("회원 삭제메뉴입니다.");
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 :
				deleteOne();
				break;
			case 2 :
				deleteAll();
				break;
			case 3 :
				System.out.println("메인으로 돌아갑니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다.");
				return;
		}
	}
	
	public void deleteOne() {
		System.out.println("단일 회원 삭제메뉴입니다.");
		System.out.print("삭제할 회원 id 입력 : ");
		String delId = sc.nextLine();
		if(mc.searchId(delId).equals(null)) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		} else {
			System.out.print("정말로 삭제하시겠습니까?(Y/N)");
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")) {
				boolean result = mc.delete(delId);
				if(result) {
					System.out.println("성공적으로 삭제했습니다.");
					return;
				}
			} else if(answer.equalsIgnoreCase("N")) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다");
				return;
			}
		}
	}
	
	public void deleteAll() {
		System.out.println("회원을 전부 삭제하는 메뉴입니다.");
		System.out.print("정말로 삭제하시겠습니까?(Y/N) : ");
		String dAll = sc.nextLine();
		if(dAll.equalsIgnoreCase("Y")) {
			mc.delete();
			System.out.println("성공적으로 모두 삭제하였습니다.");
			return;
		} else if(dAll.equalsIgnoreCase("N")) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void printAll() {
		Member[] all = mc.printAll();
		if(all == null) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		} else {
			System.out.println("저장된 회원 목록 : ");
			for(int i = 0; i < all.length; i++) {
				String info = all[i].inform();
				System.out.println(info);
			}
		}
		return;
	}
}
