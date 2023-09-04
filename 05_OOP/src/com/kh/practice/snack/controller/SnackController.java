package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public void SnackContoller() {		//기본 생성자
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind); 	// 빵 종류 데이터 넘겨받아서 저장
		s.setName(name);	// 이름
		s.setFlavor(flavor); // 재료 종류 데이터 넘겨받아서 저장
		s.setNumOf(numOf);  //
		s.setPrice(price);
		return "저장이 완료되었습니다.";	
	}
	
	public String confirmData() {
		String kind = s.getKind();
		String name = s.getName();
		String flavor = s.getFlavor();
		int numOf = s.getNumOf();
		double price = s.getPrice();
		 
		return s.information();
	}
}
