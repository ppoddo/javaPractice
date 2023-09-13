package com.kh.homework.member.controller;

import com.kh.homework.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		return 0;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email,
			String gender, int age) {
		
	}

	public String searchId(String id) {
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				return id;
			}
		}
		return null;
	}
	
	public Member[] searchName(String name) {
		int count = 0;
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getName().equals(name)) {
				m[count] = m[i];
				count++;
			}
		}
		if(count == 0) {
			return null;
		}
		return m;
	}
	
	public Member[] searchEmail(String email) {
		int count = 0;
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getEmail().equals(email)) {
				m[count] = m[i];
				count++;
			}
		}
		if(count == 0) {
			return null;
		}
		return m;
	}
	
	public boolean updatePassword(String id, String password) {
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateName(String id, String name) {
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String id) {
		for(int i = 0; i < existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i] = null;	//해당 객체 초기화
				for(int j = i; j < existMemberNum() - 1; j++) {
					m[j] = m[j+1];	// 해당객체(i번째) 다음부터 한칸씩 앞쪽으로 복사
				}
				
				m[existMemberNum() - 1] = null;	// 맨 마지막 남은 복사당한 객체 삭제
				return true;
			}
		}
		return false;
	}
	
	public void delete() {		// 모두 삭제
		for(int i = 0; i < existMemberNum(); i++) {
			m[i] = null;
		}
		return;
	}
	
	public Member[] printAll() {
		Member[] allMb = new Member[existMemberNum()];
		for(int i = 0; i < existMemberNum(); i++) {
			allMb[i] = m[i];
		}
		return allMb;
	}
	
}
