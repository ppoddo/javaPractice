package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {	//1를 호출한 메인에 tc객체에 예외 위임
		System.out.println("method1 호출됨...");
		method2();
		System.out.println("method1 종료됨...");
	}
	
	public void method2() throws Exception {	//2를 호출한 1로 예외 위임
		System.out.println("method2 호출됨...");
		method3();
		System.out.println("method2 종료됨...");
		
	}
		//throws == 호출한 메소드에 예외를 위임
		//throw == 예외를 강제로 발생시킨다
	public void method3() throws Exception {  //3을 호출한 2로 예외 위임
		System.out.println("method3 호출됨...");
		throw new Exception();
		//System.out.println("method3 종료됨..."); //예외처리때문에 닿을수 없는 코드라 주석처리
		
	}

}
