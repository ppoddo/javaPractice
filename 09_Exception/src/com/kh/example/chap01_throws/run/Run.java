package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
	public static void main(String[] args) {	
		System.out.println("프로그램 시작됨...");
		ThrowsController tc= new ThrowsController();
		try {
			tc.method1();
		} catch (Exception e) {
			e.printStackTrace();		//예외가 발생한 곳을 추적해서 보여주는 기능
			//System.out.println("Exception 예외 catch"); = 에러가 나는 부분 표시
		}
		System.out.println("프로그램 종료됨...");
	}

}
